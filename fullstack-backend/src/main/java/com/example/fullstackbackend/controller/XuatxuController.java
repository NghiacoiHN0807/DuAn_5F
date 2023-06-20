package com.example.fullstackbackend.controller;

import com.example.fullstackbackend.entity.Xuatxu;
import com.example.fullstackbackend.exception.xuatXuNotFoundException;
import com.example.fullstackbackend.services.XuatxuSevice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/xuat-xu/")
@CrossOrigin("http://localhost:3000/")
public class XuatxuController {
    @Autowired
    private XuatxuSevice xuatxuSevice;

    @GetMapping("view-all")
    public Page<Xuatxu> viewAll(@RequestParam(defaultValue = "0") Integer page,
                                @RequestParam(defaultValue = "5") Integer size,
                                @RequestParam("p") Optional<Integer> p) {
        Page<Xuatxu> xuatxus = xuatxuSevice.chatlieuPage(p.orElse(page), size);
        return xuatxus;
    }

    @PostMapping("add")
    public Xuatxu add(@Valid @RequestBody Xuatxu xuatxu,
                BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return null;
        } else {
            return xuatxuSevice.add(xuatxu);
        }
    }

    @GetMapping("detail/{id}")
    public String detail(@PathVariable("id") Integer id, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "5") Integer size, @RequestParam("p") Optional<Integer> p, Model model) {

        Xuatxu xuatxu = new Xuatxu();
        model.addAttribute("add", xuatxu);

        Optional<Xuatxu> xuatxu1 = xuatxuSevice.detail(id);
        model.addAttribute("getOne", xuatxu1.get());

        Page<Xuatxu> chatlieus = xuatxuSevice.chatlieuPage(p.orElse(page), size);
        model.addAttribute("xuatxus", chatlieus);

        return "XuatXu";
    }

    @DeleteMapping ("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        if(!xuatxuSevice.checkExists(id)){
            throw new xuatXuNotFoundException(id);
        }else {
            xuatxuSevice.delete(id);
            return "";
        }
    }

    @GetMapping("view-update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {

        Xuatxu xuatxu = new Xuatxu();
        model.addAttribute("update", xuatxu);

        Optional<Xuatxu> chatlieu = xuatxuSevice.detail(id);
        model.addAttribute("getOne", chatlieu.get());

        return "Update-XuatXu";
    }

    @PostMapping("update")
    public Xuatxu update(@RequestBody Xuatxu xuatxu) {
        return xuatxuSevice.update(xuatxu);
    }
}
