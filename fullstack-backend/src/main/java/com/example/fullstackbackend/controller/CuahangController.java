package com.example.fullstackbackend.controller;


import com.example.fullstackbackend.entity.Cuahang;
import com.example.fullstackbackend.services.CuahangSevice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/cua-hang/")
public class CuahangController {
    @Autowired
    private CuahangSevice cuahangSevice;

    @GetMapping("view-all")
    public String viewAll(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "5") Integer size, @RequestParam("p") Optional<Integer> p, Model model) {
        Cuahang chatlieu = new Cuahang();
        model.addAttribute("add", chatlieu);

        Page<Cuahang> xuatxus = cuahangSevice.chatlieuPage(p.orElse(page), size);
        model.addAttribute("xuatxus", xuatxus);
        return "CuaHang";
    }

    @PostMapping("add")
    public String add(@Valid @ModelAttribute("add") Cuahang xuatxu,
                      BindingResult bindingResult,
                      @RequestParam(defaultValue = "0") Integer page,
                      @RequestParam(defaultValue = "5") Integer size,
                      @RequestParam("p") Optional<Integer> p,
                      Model model) {
        if (bindingResult.hasErrors()) {
            Page<Cuahang> xuatxus = cuahangSevice.chatlieuPage(p.orElse(page), size);
            model.addAttribute("xuatxus", xuatxus);
            return "CuaHang";
        } else {
            cuahangSevice.add(xuatxu);
            return "redirect:/cua-hang/view-all";
        }
    }

    @GetMapping("detail/{id}")
    public String detail(@PathVariable("id") Integer id, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "5") Integer size, @RequestParam("p") Optional<Integer> p, Model model) {

        Cuahang xuatxu = new Cuahang();
        model.addAttribute("add", xuatxu);

        Optional<Cuahang> xuatxu1 = cuahangSevice.detail(id);
        model.addAttribute("getOne", xuatxu1.get());

        Page<Cuahang> chatlieus = cuahangSevice.chatlieuPage(p.orElse(page), size);
        model.addAttribute("xuatxus", chatlieus);

        return "CuaHang";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id, Model model) {
        cuahangSevice.delete(id);
        return "redirect:/cua-hang/view-all";
    }

    @GetMapping("view-update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {

        Cuahang xuatxu = new Cuahang();
        model.addAttribute("update", xuatxu);

        Optional<Cuahang> chatlieu = cuahangSevice.detail(id);
        model.addAttribute("getOne", chatlieu.get());

        return "Update-CuaHang";
    }

    @PostMapping("update")
    public String update(@ModelAttribute("update") Cuahang xuatxu) {
        cuahangSevice.update(xuatxu);
        return "redirect:/cua-hang/view-all";
    }
}
