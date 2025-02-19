package br.com.apirestcontroller.apirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controller responde a toda requisição
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @GetMapping("/{id}") // Passsar parâmetros (como se fossem variáveis no endpoint)
    public String buscaUsuario(@PathVariable int id) { // Retornar o valor que você quer em variável
        return "Usuario com ID: " + id; // Mostrará o id que foi colocado na URL
    }
}
