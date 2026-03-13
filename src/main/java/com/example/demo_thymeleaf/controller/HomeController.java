package com.example.demo_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("titulo", "Hola mundo!");
        model.addAttribute("mensaje", "Bienvenido a Thymelead");
        return "index";
    }

    @GetMapping("/formulari")
    public String mostrarFormulari() {
        return "formulari";
    }

}
