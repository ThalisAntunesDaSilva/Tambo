package com.api.tambo.Service;

import java.util.List;

import com.api.tambo.Entity.Produto;
import com.api.tambo.Repository.ProdutoRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "")

@RequestMapping(value = "/produtos")

public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

 
    @GetMapping
    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();

    }

    @GetMapping("/produto/{id}")
    public Produto listaProduto(@PathVariable(value="id") int id) {
        return produtoRepository.findById(id);

    }

    @PostMapping("/produto")
    public Produto salvaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto")
    public void deletaProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }

    @PutMapping("/produto")
    public Produto atualizaProduto(@RequestBody Produto produto){
       return  produtoRepository.save(produto);
    }



}