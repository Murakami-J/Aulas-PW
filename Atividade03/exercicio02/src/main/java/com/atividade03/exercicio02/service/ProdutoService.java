package com.atividade03.exercicio02.service;

import com.atividade03.exercicio02.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private final List<Produto> produtos = new ArrayList<>();

    public String cadastrarProduto(Produto produto) {
        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getId().equals(produto.getId())){
                return "Já existe um produto cadastrado com o id %d!".formatted(produto.getId());
            }
        }
        produtos.add(produto);
        return "Produto cadastrado com sucesso!";
    }

    public Produto buscarProdutoPorId(Long id) {
        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getId().equals(id)){
                return produtos.get(i);
            }
        }
        return null;
    }
}
