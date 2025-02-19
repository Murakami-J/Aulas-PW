package br.com.apirestcontroller.apirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Ele só vai aparecer quando estivermos na /api
public class HelloController {
    @GetMapping("/hello") // Ele só vai funcionar se for uma requisição do tipo GET no front (http)
     public String digaOla() {
        return "Olá, bem-vindo(a) ao Spring Boot";
    }
}
