package com.example.demo.controller;

import com.example.demo.dto.Categoria;
import com.example.demo.service.XDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejemplo")
public class EjemploController {
@Autowired
private XDService xd1;
    @RequestMapping("/saludo")
    public ResponseEntity<Categoria> saludo() {
        return ResponseEntity.ok(xd1.getAll());
    }

    @RequestMapping("/despedida")
    public String despedida() {
        return "¡Adiós, mundo!";
    }
}
