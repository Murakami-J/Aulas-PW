package com.exemplo.aula3.apidadosh2.repository;

import com.exemplo.aula3.apidadosh2.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// interface = segurança ao passar os dados dos getters e setters /
//  > é uma camada de segurança para que ninguém de fora tenha acesso direto ao arquivo dos getters e setters
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}
