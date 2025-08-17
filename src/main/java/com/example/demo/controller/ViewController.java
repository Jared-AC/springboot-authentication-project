package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    // Página principal
    @GetMapping("/")
    public String index() {
        return "index"; // busca templates/index.html
    }

    // Página de registro
    @GetMapping("/register")
    public String registerPage() {
        return "register"; // busca templates/register.html
    }

    // Página de login
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // busca templates/login.html
    }

     @GetMapping("/dashboard")
    public String dashboardPage() {
        return "dashboard";
    }
}
