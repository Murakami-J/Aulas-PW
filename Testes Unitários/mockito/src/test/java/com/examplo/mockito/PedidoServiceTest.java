package com.examplo.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
public class PedidoServiceTest {
    @Mock // Criar um Mock da classe de Pagamento
    private PagamentosService pagamentosService;

    @InjectMocks // Injetar o Mock criado dentro da PedidoService
    private PedidoService pedidoService;

    @Test
    void deveConfirmarPedidoComPagamentoAprovado() {
        // Simular que o pagaamento foi aprovado
        Mockito.when(pagamentosService.ProcessarPagamento(100.00)).thenReturn(true);
        String resultado = pedidoService.realizarPedido(100.00);
        assertEquals("Pedido confirmado!", resultado); // Testa o resultado esperado
    }

    @Test
    void deveConfirmarPedidoComPagamentoReprovado() {
        // Simular que o pagaamento foi reprovado
        Mockito.when(pagamentosService.ProcessarPagamento(50.0)).thenReturn(false);
        String resultado = pedidoService.realizarPedido(50.0);
        assertEquals("Pedido recusado!", resultado); // Testa o resultado esperado
    }

    @Test
    void deveChamarProcessamentoDePagamento() {
        // SImular qualquer valor retornando true
        Mockito.when(pagamentosService.ProcessarPagamento(Mockito.anyDouble())).thenReturn(true);
        pedidoService.realizarPedido(200.0);

        // Verificar se o método foi chamado exatamente uma vez
        Mockito.verify(pagamentosService, Mockito.times(1)).ProcessarPagamento(200.00);
    }
}
