package com.atividade03.exercicio02.model;

public class Produto {
    private Long id;
    private String nome;
    private Double preco;

    public Produto() {
    }

    public Produto(Long id, String nome, Double preco, Cliente cliente) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
