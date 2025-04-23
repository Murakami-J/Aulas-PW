package com.examplo.observer.service.observer;

import com.examplo.observer.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class LogObserver implements PedidoObserver {
    @Override
    public void notificar(Pedido pedido){
        System.out.println("Log registrado pedido: " + pedido.getCliente());
    }

}
