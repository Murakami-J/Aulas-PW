package com.examplo.observer.controller;

import com.examplo.observer.model.Pedido;
import com.examplo.observer.service.PedidoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private final PedidoService pedidoService;
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }
    
    @PostMapping
    public String concluirPedido(@RequestBody Pedido pedido){
        pedidoService.concluirPedido(pedido);
        return "Pedido processado";
    }
}
