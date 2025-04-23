package com.examplo.observer.service.observer;

import com.examplo.observer.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoObserver implements PedidoObserver{
    @Override
    public void notificar(Pedido pedido){
        System.out.println("Notificação enviada para " + pedido.getCliente());
    }

}
