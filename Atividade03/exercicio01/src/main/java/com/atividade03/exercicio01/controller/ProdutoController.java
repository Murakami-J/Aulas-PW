package com.atividade03.exercicio01.controller;

import com.atividade03.exercicio01.model.Produto;
import com.atividade03.exercicio01.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public String adicionarProduto(@RequestBody Produto produto){
       return produtoService.adicionarProduto(produto);
    }

    @GetMapping
    public List<Produto> listarProdutos(){
        return produtoService.listarProdutos();
    }

    @GetMapping("/{id}")
    public String listarProdutosPorId(@PathVariable Long id){
        return produtoService.listarProdutosPorId(id);
    }

    @PutMapping("/{id}")
    public String atualizarProduto(@PathVariable Long id, @RequestBody Produto produto){
        return produtoService.atualizarProduto(id, produto);
    }

    @DeleteMapping("/{id}")
    public String deletarProduto(@PathVariable Long id){
        return produtoService.deletarProduto(id);
    }
}
