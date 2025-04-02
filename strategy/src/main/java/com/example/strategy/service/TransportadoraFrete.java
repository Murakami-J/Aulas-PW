package com.example.strategy.service;

import org.springframework.stereotype.Component;

@Component
public class TransportadoraFrete implements FreteStrategy{
    @Override
    public double calcular(double peso){
        return peso * 2.0 + 10;
    }

    @Override
    public String tipo(){
        return "Transportadora";
    }
}
