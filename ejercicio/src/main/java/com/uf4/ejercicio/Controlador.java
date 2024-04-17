package com.uf4.ejercicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    
    @GetMapping("/saludar")
    public String saludo() {
        return "Hola que tal";
    }
}
