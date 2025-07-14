package com.VoltechCtrl.VoltechCtrl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to Thymeleaf + Spring Boot!");
        return "index";
    }
}
