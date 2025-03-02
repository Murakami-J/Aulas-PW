package com.atividade03.exercicio02.controller;

import com.atividade03.exercicio02.model.Cliente;
import com.atividade03.exercicio02.service.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public String cadastrarCliente(@RequestBody Cliente cliente) {
       return clienteService.cadastrarCliente(cliente);
    }
}
