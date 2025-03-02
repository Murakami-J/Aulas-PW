package com.atividade03.exercicio02.controller;

import com.atividade03.exercicio02.model.Produto;
import com.atividade03.exercicio02.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    private final ProdutoService produtoService;
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public String cadastrarProduto(@RequestBody Produto produto) {
       return produtoService.cadastrarProduto(produto);
    }
}
