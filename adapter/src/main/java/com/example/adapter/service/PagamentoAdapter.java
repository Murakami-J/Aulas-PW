package com.example.adapter.service;

import org.springframework.stereotype.Service;

@Service("paypal")
public class PagamentoAdapter implements PagamentoService {
    private final PagamentoPayPal paypal;
    public PagamentoAdapter() {
        this.paypal = new PagamentoPayPal();
    }

    @Override
    public void processarPagamento(double valor){
        paypal.pagarComPayPal(valor);
    }
}
