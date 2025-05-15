package com.examplo.teste;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest // Passa algo JUnit que deve ser iniciado
public class CalculadoraServiceTest {
    @Autowired
    private CalculadoraService calculadoraService;

    @Test
    void deveSomarCorretamente(){
        // Testar se a soma de 2 + 3 retorna 5
        int resultado = calculadoraService.somar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void deveDividirCorretamente(){
        double resultado = calculadoraService.dividir(10, 5);
        assertEquals(2, resultado);
    }

    @Test
    void deveLancarExcecaoCorretamente(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculadoraService.dividir(10, 0);
        });
    }
}
