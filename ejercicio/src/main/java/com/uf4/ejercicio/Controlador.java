package com.uf4.ejercicio;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    
    @GetMapping("/saludar")
    public String saludo() {
        return "Hola que tal";
    }

    @PostMapping("/lista")
    public ArrayList<String> lista() {
        return new ArrayList<String>();
    }
}
