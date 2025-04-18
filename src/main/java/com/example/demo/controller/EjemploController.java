package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejemplo")
public class EjemploController {
    @RequestMapping("/saludo")
    public String saludo() {
        return "¡Hola, mundo!";
    }

    @RequestMapping("/despedida")
    public String despedida() {
        return "¡Adiós, mundo!";
    }
}
