package com.example.jpql.repository;

import com.example.jpql.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Usando JPQL para listar os produtos acima de um determinado valor
    // Não precisamos passar o nome da tabela, é passado o nome da classe
    @Query("SELECT p FROM Produto p WHERE p.preco > :valor")
    List<Produto> buscarProdutosCaros(@Param("valor") double valor);
}
