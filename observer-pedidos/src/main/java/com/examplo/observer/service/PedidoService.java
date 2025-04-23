package com.examplo.observer.service;

import com.examplo.observer.model.Pedido;
import com.examplo.observer.service.observer.PedidoObserver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    private final List<PedidoObserver> observadores;

    public PedidoService(List<PedidoObserver> observadores) {
        this.observadores = observadores;
    }

    public void concluirPedido(Pedido pedido){
        System.out.println("Pedido " + pedido.getId() + " concluido");
        // Notificar todos os observadores
        observadores.forEach(obs -> obs.notificar(pedido));
    }
}
