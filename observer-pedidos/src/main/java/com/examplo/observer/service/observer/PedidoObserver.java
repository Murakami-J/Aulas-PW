package com.examplo.observer.service.observer;

import com.examplo.observer.model.Pedido;

public interface PedidoObserver {
    void notificar(Pedido pedido);
}
