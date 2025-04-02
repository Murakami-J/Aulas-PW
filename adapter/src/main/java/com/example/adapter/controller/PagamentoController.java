package com.example.adapter.controller;

import com.example.adapter.service.PagamentoService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {
    private final PagamentoService pagamentoService;

    public PagamentoController(@Qualifier("paypal")PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping
    public String pagar(@RequestParam double valor){
        pagamentoService.processarPagamento(valor);
        return "Pagamento realizado com sucesso!";
    }
}
