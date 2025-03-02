package com.atividade03.exercicio02.service;

import com.atividade03.exercicio02.model.Cliente;
import com.atividade03.exercicio02.model.Pedido;
import com.atividade03.exercicio02.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {
    private final List<Pedido> pedidos = new ArrayList<>();

    private final ProdutoService produtoService;
    private final ClienteService clienteService;
    public PedidoService(ProdutoService produtoService, ClienteService clienteService
    ) {
        this.produtoService = produtoService;
        this.clienteService = clienteService;
    }

    public String registrarPedido(Pedido pedido) {
        for(int i = 0; i < pedidos.size(); i++){
            if(pedidos.get(i).getId().equals(pedido.getId())){
                return "Já existe um pedido cadastrado com o ID %d!".formatted(pedido.getId());
            }
        }

        for(int i = 0; i < pedido.getProdutos().size(); i++){
            Produto produto = produtoService.buscarProdutoPorId(pedido.getProdutos().get(i).getId());
            if(produto == null){
                return "O produto com ID %d não está cadastrado no sistema!"
                        .formatted(pedido.getProdutos().get(i).getId());
            }
        }

        Cliente cliente = clienteService.buscarClientePorId(pedido.getCliente().getId());
        if(cliente == null){
            return "Não existe um cliente cadastrado com o ID %d!"
                    .formatted(pedido.getCliente().getId());
        }

        pedidos.add(pedido);
        return "Pedido registrado com sucesso!";
    }

    public List<Pedido> listarDetalhesPedidos(){
        return pedidos;
    }

    public Pedido listarPedidosPorId(Long id){
        for(int i = 0; i < pedidos.size(); i++){
            if(pedidos.get(i).getId().equals(id)){
                return pedidos.get(i);
            }
        }
        return null;
    }

    public Double calcularValorTotalPedido(Long id) {
        Pedido pedido = listarPedidosPorId(id);
        if(pedido == null){
            return null;
        }
        Double valorTotal = 0.0;
        for(int i = 0; i < pedido.getProdutos().size(); i++){
            Produto produto = produtoService.buscarProdutoPorId(pedido.getProdutos().get(i).getId());
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }
}
