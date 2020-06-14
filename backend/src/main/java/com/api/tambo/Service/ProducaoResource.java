package com.api.tambo.Service;

import java.util.List;

import com.api.tambo.Entity.Producao;
import com.api.tambo.Repository.ProducaoRepository;
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

@RequestMapping(value = "/producoes")

public class ProducaoResource {

    @Autowired
    ProducaoRepository producaoRepository;

    @GetMapping
    public List<Producao> listaProducao() {
        return producaoRepository.findAll();

    }

    @GetMapping("/producao/{id}")
    public Producao listaProducao(@PathVariable(value="id") int id) {
        return producaoRepository.findById(id);

    }

    @PostMapping("/producao")
    public Producao salvaProducao(@RequestBody Producao producao){
        return producaoRepository.save(producao);
    }

    @DeleteMapping("/producao")
    public void deletaProducao(@RequestBody Producao producao){
        producaoRepository.delete(producao);
    }

    @PutMapping("/producao")
    public Producao atualizaNascimento(@RequestBody Producao producao){
       return  producaoRepository.save(producao);
    }



}