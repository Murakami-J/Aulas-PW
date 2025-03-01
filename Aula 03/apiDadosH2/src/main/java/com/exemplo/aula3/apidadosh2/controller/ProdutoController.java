package com.exemplo.aula3.apidadosh2.controller;

import com.exemplo.aula3.apidadosh2.model.Produto;
import com.exemplo.aula3.apidadosh2.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    private final ProdutoRepository produtoRepository;
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // Get - Listar todos os produtos
    @GetMapping
    public List<Produto> listarProdutos() {
        // SELECT = find (tem variações: find*)
        // findAll: busca todos os elementos
        return produtoRepository.findAll();
    }

    // Get - Listar por ID
    @GetMapping("/{id}")
    public Optional<Produto> buscarProdutoPorId(@PathVariable Long id) {
        return produtoRepository.findById(id);
    }

    // Post - Adicionar um novo produto
    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto) {
        // INSERT = save
        return produtoRepository.save(produto);
    }

    // Delete - Remover um Produto
    @DeleteMapping("{id}") // o parâmetro é como se fosse o WHERE do banco de dados
    public String deletarProduto(@PathVariable Long id) {
        produtoRepository.deleteById(id);
        return "Produto removido com sucesso";
    }

    // PUT - Atualizar Produto
    @PutMapping("{id}")
    // Passar o ID como "WHERE"
    // Tem que ter um @RequestBody pq tem que passar o novo produto atualizado
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody Produto novoProduto) {
        // map() = vai procurar pelo produto do id passado no parâmetro (mapear os valores)
        return produtoRepository.findById(id).map(produto -> {
            produto.setNome(produto.getNome()); // pegar o novo nome do produto
            produto.setPreco(produto.getPreco()); // pegar o novo preco do produto
            return produtoRepository.save(produto); // salvar as alterações
        }).orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        // Se der erro (não encontrar o produto com o id = x), ele vai retornar um exception de que o produto não foi encontrado
    }
}
