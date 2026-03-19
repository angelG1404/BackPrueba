package com.example.backtienda.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "API BackPrueba funcionando 🚀";
    }
}