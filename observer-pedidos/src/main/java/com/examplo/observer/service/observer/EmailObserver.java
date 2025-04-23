package com.examplo.observer.service.observer;

import com.examplo.observer.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class EmailObserver implements PedidoObserver {
    @Override
    public void notificar(Pedido pedido){
        System.out.println("Email enviado para " + pedido.getCliente());
    }
}
