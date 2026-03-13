package com.example.demo_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Arrays;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("titulo", "Hola mundo!");
        model.addAttribute("mensaje", "Bienvenido a Thymelead");
        model.addAttribute("llista", Arrays.asList("Item 1", "Item 2", "Item 3"));
        return "index";
    }

    @GetMapping("/formulari")
    public String mostrarFormulari() {
        return "formulari";
    }

    @PostMapping("/processar")
    public String processarFormulari(@RequestParam String nom, Model model) {
        model.addAttribute("salutacio", "Hola, " + nom + "!");
        return "resultat";
    }
}
