package com.atividade03.exercicio02.service;

import com.atividade03.exercicio02.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private final List<Cliente> clientes = new ArrayList<>();

    public String cadastrarCliente(Cliente cliente) {
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getId().equals(cliente.getId())){
                return "Cliente com id %d já cadastrado!".formatted(cliente.getId());
            }
        }
        clientes.add(cliente);
        return "Cliente cadastrado com sucesso!";
    }

    public Cliente buscarClientePorId(Long id) {
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getId().equals(id)){
                return clientes.get(i);
            }
        }
        return null;
    }
}
