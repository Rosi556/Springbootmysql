package com.Springbootmysql.Springbootmysql.controller;

import com.Springbootmysql.Springbootmysql.entity.Produto;
import com.Springbootmysql.Springbootmysql.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/produto")
    public Produto addProduto(@RequestBody Produto produto) {
        return produtoService.add(produto);
    }

    @GetMapping("/produto/{id}")
    public Produto getProduto(@PathVariable(value = "id") long id) {
        return produtoService.get(id);
    }

    @PutMapping("/produto/{id}")
    public Produto updateProduto(@RequestBody Produto produto, @PathVariable(value = "id") long id) {
        Optional<Produto> prod = produtoService.findById(id);
        if(prod.isPresent()){
            produto.setId(prod.get().getId());
            return produtoService.update(produto);
        }
        return null;
    }
}