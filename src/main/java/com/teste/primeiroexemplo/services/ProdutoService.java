package com.teste.primeiroexemplo.services;

import java.util.List;
import java.util.Optional;

import com.teste.primeiroexemplo.model.Produto;
import com.teste.primeiroexemplo.repository.ProdutoRepository_old;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProdutoService {

    @Autowired
    private ProdutoRepository_old produtoRepository;

    /**
     * Método para retornar uma lista de produtos
     * 
     * @return Lista de produtos.
     */
    public List<Produto> obterTodos() {
        return produtoRepository.obterTodos();
    }

    /**
     * Método que retorna o produto encontrado pelo seu Id.
     * 
     * @param id do produto que será localizado
     * @return Retorna um produto caso tenha encontrado.
     */

    public Optional<Produto> obterPorId(Integer id) {
        return produtoRepository.obterPorId(id);
    }

    /**
     * Método para adicionar produto na lista
     * 
     * @param produto que será adicionado
     * @return produto que adicionado na lista.
     */
    public Produto adicionar(Produto produto) {
        // Poderia ter alguma regra de negócio para validar produto.
        return produtoRepository.adicionar(produto);
    }

    /**
     * Método para deletar o produto por id
     * 
     * @param id do produto a ser deletado
     */
    public void deletar(Integer id) {
        // Poderia ter alguma lógica de validação aqui.
        produtoRepository.deletar(id);

    }

    /**
     * Método para atualizar o produto na lista
     * 
     * @param produto que será atualizado
     * @param id do produto.
     * @return Retorna o produto após atualizar a lista.
     */
    public Produto atualizar(Integer id, Produto produto) {

        // Poderia ter alguma validação no ID.
        produto.setId(id);

        return produtoRepository.atualizar(produto);
    }
}
