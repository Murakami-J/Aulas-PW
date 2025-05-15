package com.examplo.calculadora;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
        public int somar(int a, int b){
            return a+b;
        }
        public int subtrair(int a, int b){
            return a-b;
        }
        public int multiplicar(int a, int b){
            return a*b;
        }
        public double dividir(int a, int b){
            if(b == 0){
                throw new IllegalArgumentException("Proibido dividir por Zero!");
            }
            return (double) a /b;
        }
}
