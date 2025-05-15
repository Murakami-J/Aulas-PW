package com.examplo.mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    private final PagamentosService pagamentosService;

    @Autowired
    public PedidoService(PagamentosService pagamentosService) {
        this.pagamentosService = pagamentosService;
    }

    public String realizarPedido(double valor){
        boolean sucesso = pagamentosService.ProcessarPagamento(valor);
        return sucesso ? "Pedido confirmado!" : "Pedido recusado!";
    }

}
