package com.example2.__spring_web_rest.controller;

import com.example2.__spring_web_rest.model.Produto;
import com.example2.__spring_web_rest.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping(value = "/save")
    public ResponseEntity<Produto> save(@RequestBody Produto produto) {
        return ResponseEntity.ok(service.save(produto));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<Produto>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
