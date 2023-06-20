package com.example.fullstackbackend.controller;

import com.example.fullstackbackend.entity.Mausac;
import com.example.fullstackbackend.services.MausacSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/mau-sac/")
public class MausacController {
    @Autowired
    private MausacSevice mausacSevice;

    @GetMapping("view-all")
    public String viewAll(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "5") Integer size, @RequestParam("p") Optional<Integer> p, Model model) {
        Mausac chatlieu = new Mausac();
        model.addAttribute("add", chatlieu);

        Page<Mausac> xuatxus = mausacSevice.chatlieuPage(p.orElse(page), size);
        model.addAttribute("xuatxus", xuatxus);
        return "MauSac";
    }

    @PostMapping("add")
    public String add(@ModelAttribute("add") Mausac xuatxu) {
        mausacSevice.add(xuatxu);
        return "redirect:/mau-sac/view-all";
    }

    @GetMapping("detail/{id}")
    public String detail(@PathVariable("id") Integer id, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "5") Integer size, @RequestParam("p") Optional<Integer> p, Model model) {

        Mausac xuatxu = new Mausac();
        model.addAttribute("add", xuatxu);

        Optional<Mausac> xuatxu1 = mausacSevice.detail(id);
        model.addAttribute("getOne", xuatxu1.get());

        Page<Mausac> chatlieus = mausacSevice.chatlieuPage(p.orElse(page), size);
        model.addAttribute("xuatxus", chatlieus);

        return "MauSac";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id, Model model) {
        mausacSevice.delete(id);
        return "redirect:/mau-sac/view-all";
    }

    @GetMapping("view-update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {

        Mausac xuatxu = new Mausac();
        model.addAttribute("update", xuatxu);

        Optional<Mausac> chatlieu = mausacSevice.detail(id);
        model.addAttribute("getOne", chatlieu.get());

        return "Update-MauSac";
    }

    @PostMapping("update")
    public String update(@ModelAttribute("update") Mausac xuatxu) {
        mausacSevice.update(xuatxu);
        return "redirect:/mau-sac/view-all";
    }
}
