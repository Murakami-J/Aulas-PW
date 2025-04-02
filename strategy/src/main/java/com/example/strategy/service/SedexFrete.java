package com.example.strategy.service;

import org.springframework.stereotype.Component;

@Component
// Transforma a classe em um componente, uma peça em um determinado código
// A partir que é criado um componente, pode falar que ela vai implementar algo
public class SedexFrete implements FreteStrategy {
    @Override
    public double calcular(double peso) {
        return peso * 1.5;
    }

    @Override
    public String tipo() {
        return "sedex";
    }
}
