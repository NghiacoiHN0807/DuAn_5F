package com.example.fullstackbackend.controller;

import com.example.fullstackbackend.entity.Sanpham;
import com.example.fullstackbackend.services.SanPhamSevice;
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
@RequestMapping("/san-pham/")
public class SanPhamController {
    @Autowired
    private SanPhamSevice sanPhamSevice;

    @GetMapping("view-all")
    public String viewAll(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "5") Integer size,
                          @RequestParam("p") Optional<Integer> p, Model model) {
        Sanpham chatlieu = new Sanpham();
        model.addAttribute("add", chatlieu);

        Page<Sanpham> xuatxus = sanPhamSevice.chatlieuPage(p.orElse(page), size);
        model.addAttribute("xuatxus", xuatxus);
        return "SanPham";
    }

    @PostMapping("add")
    public String add(@Valid @ModelAttribute("add") Sanpham xuatxu,
                      BindingResult bindingResult, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "5") Integer size,
                      @RequestParam("p") Optional<Integer> p, Model model) {
        if (bindingResult.hasErrors()) {
            Page<Sanpham> xuatxus = sanPhamSevice.chatlieuPage(p.orElse(page), size);
            model.addAttribute("xuatxus", xuatxus);
            return "SanPham";
        } else {
            sanPhamSevice.add(xuatxu);
            return "redirect:/san-pham/view-all";
        }
    }

    @GetMapping("detail/{id}")
    public String detail(@PathVariable("id") Integer id, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "5") Integer size, @RequestParam("p") Optional<Integer> p, Model model) {

        Sanpham xuatxu = new Sanpham();
        model.addAttribute("add", xuatxu);

        Optional<Sanpham> xuatxu1 = sanPhamSevice.detail(id);
        model.addAttribute("getOne", xuatxu1.get());

        Page<Sanpham> chatlieus = sanPhamSevice.chatlieuPage(p.orElse(page), size);
        model.addAttribute("xuatxus", chatlieus);

        return "SanPham";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id, Model model) {
        sanPhamSevice.delete(id);
        return "redirect:/san-pham/view-all";
    }

    @GetMapping("view-update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {

        Sanpham xuatxu = new Sanpham();
        model.addAttribute("update", xuatxu);

        Optional<Sanpham> chatlieu = sanPhamSevice.detail(id);
        model.addAttribute("getOne", chatlieu.get());

        return "Update-SanPham";
    }

    @PostMapping("update")
    public String update(@ModelAttribute("update") Sanpham xuatxu) {
        sanPhamSevice.update(xuatxu);
        return "redirect:/san-pham/view-all";
    }
}
