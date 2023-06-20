package com.example.fullstackbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/")
    private String login() {
        return "redirect:/cua-hang/view-all";
    }
}
