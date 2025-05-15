package com.examplo.calculadora;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculadoraServiceTest {
    @Autowired
    private CalculadoraService service;

    @Test
    void testSomar(){
        assertEquals(7, service.somar(3, 4));
    }

    @Test
    void testSubtrair(){
        assertEquals(1, service.subtrair(5, 4));
    }

    @Test
    void testMultiplicar(){
        assertEquals(20, service.multiplicar(5, 4));
    }

    @Test
    void testDividir(){
        assertEquals(2.0, service.dividir(10, 5));
    }

    @Test
    void testDividirPorZero(){
        assertThrows(IllegalArgumentException.class, () -> service.dividir(5, 0));
    }
}
