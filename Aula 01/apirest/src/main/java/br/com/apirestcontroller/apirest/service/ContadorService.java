package br.com.apirestcontroller.apirest.service;

import org.springframework.stereotype.Service;

/*
Classe Singleton de serviço: garante que seja chamado uma nova e única instância
Por exemplo: Uma página só deixa apenas um usuário editar, se duas pessoas tentarem alterar um certo dado ao mesmo tempo não será possível.
Enquanto um usuário estiver alterando, os outros usuários não conseguirão acessar  (estará bloqueado)
Bloquear o tempo de execução daquele objeto/instância
Não deixar que duas pessoas alterem simultaneamente uma informação
 */

@Service
public class ContadorService {
    private int contador = 0;
    public int incrementar() {
        return ++contador;
    }
    public int getContador() {
        return contador;
    }
}
