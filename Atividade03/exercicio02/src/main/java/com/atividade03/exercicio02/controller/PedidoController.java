package com.atividade03.exercicio02.controller;

import com.atividade03.exercicio02.model.Pedido;
import com.atividade03.exercicio02.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    private final PedidoService pedidoService;
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public String registrarPedido(@RequestBody Pedido pedido) {
        return pedidoService.registrarPedido(pedido);
    }

    @GetMapping
    public List<Pedido> listarDetalhesPedidos() {
        return pedidoService.listarDetalhesPedidos();
    }

    @GetMapping("/listar/{id}")
    public Pedido listarPedidosPorId(@PathVariable("id") Long id) {
        return pedidoService.listarPedidosPorId(id);
    }

    @GetMapping("/total/{id}")
    public Double calcularValorTotalPedido(@PathVariable("id") Long id) {
        return pedidoService.calcularValorTotalPedido(id);
    }
}
