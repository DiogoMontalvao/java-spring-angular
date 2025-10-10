package com.example2.__spring_web_rest.service;

import com.example2.__spring_web_rest.exception.ProdutoNullException;
import com.example2.__spring_web_rest.exception.ProdutoPrecoException;
import com.example2.__spring_web_rest.model.Produto;
import com.example2.__spring_web_rest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto save(Produto produto) {
        if (produto.getNome() == null || produto.getPreco() == null)
            throw new ProdutoNullException();

        if (produto.getPreco() < 0.0)
            throw new ProdutoPrecoException();

        return repository.save(produto);
    }

    public Produto findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Produto> findAll() {
        return repository.findAll();
    }
}
