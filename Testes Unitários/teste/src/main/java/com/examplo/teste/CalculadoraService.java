package com.examplo.teste;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    // Método que soma dois números
    public int somar(int a, int b){
        return a+b;
    }

    // Método que divide dois números
    public double dividir(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Não é permitido divisão por zero");
        }
        return (double) a /b;
    }
}
