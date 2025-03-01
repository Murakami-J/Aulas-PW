package com.exemplo.aula3.apidadosh2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Primary Key
    private Long id;
    private String nome;
    private double preco;

    public Produto() {}
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
