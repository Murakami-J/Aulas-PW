package com.atividade03.exercicio01.service;

import com.atividade03.exercicio01.model.Produto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private final List<Produto> produtos = new ArrayList<>();

    public String adicionarProduto(Produto produto){
        for(int i = 0; i<produtos.size(); i++){
            if(produtos.get(i).getId().equals(produto.getId())){
                return """
                        Já existe um produto com este ID: 
                        Id: %d
                        Nome: %s
                        Preço: R$%.2f
                        """.formatted(produtos.get(i).getId(), produtos.get(i).getNome(), produtos.get(i).getPreco());
            }
        }
        produtos.add(produto);
        return "Produto cadastrado com sucesso!";
    }

    public List<Produto> listarProdutos(){
        return produtos;
    }

    public String listarProdutosPorId(Long id){
        for(int i = 0; i<produtos.size(); i++){
            if(produtos.get(i).getId().equals(id)){
                return """
                        Produto encontrado com sucesso!:
                        Id: %d
                        Nome: %s
                        Preço: R$%.2f
                        """.formatted(id, produtos.get(i).getNome(), produtos.get(i).getPreco());
            }
        }
        return "Produto com id %d não encontrado".formatted(id);
    }

    public String atualizarProduto(Long id, Produto produto){
        for(int i = 0; i<produtos.size(); i++){
            if(produtos.get(i).getId().equals(id)){
                produtos.set(i, produto);
                return "Produto atualizado com sucesso!";
            }
        }
        return "Produto com id %d não encontrado".formatted(id);
    }

    public String deletarProduto(Long id){
        for(int i = 0; i<produtos.size(); i++){
            if(produtos.get(i).getId().equals(id)){
                produtos.remove(i);
                return "Produto deletado com sucesso!";
            }
        }
        return "Produto com id %d não encontrado".formatted(id);
    }
}
