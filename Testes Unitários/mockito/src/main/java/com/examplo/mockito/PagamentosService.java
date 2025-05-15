package com.examplo.mockito;

import org.springframework.stereotype.Service;

@Service
public class PagamentosService {
    // Toda a lógica de pagamentos

    public boolean ProcessarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor);
        return true;
    }
}
