package com.atividade03.exercicio02.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Long id;
    private Cliente cliente;
    private List<Produto> produto;

    public Pedido() {
    }

    public Pedido(Long id, Cliente cliente, List<Produto> produto) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produto;
    }

    public void setProdutos(List<Produto> produto) {
        this.produto = produto;
    }
}
