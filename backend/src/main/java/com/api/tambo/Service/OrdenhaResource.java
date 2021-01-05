package com.api.tambo.Service;

import java.util.List;

import com.api.tambo.Controller.OrdenhaController;
import com.api.tambo.Entity.Ordenha;
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

public class OrdenhaResource {

    @Autowired
    OrdenhaController producaoController;

    @GetMapping
    public List<Ordenha> listaProducao() {
        return producaoController.listaOrdenhas();

    }

    @GetMapping("/producao/{id}")
    public Ordenha listaProducao(@PathVariable(value="id") int id) {
        return producaoController.buscarOrdenha(id);

    }

    @PostMapping("/producao")
    public Ordenha salvaProducao(@RequestBody Ordenha producao){
        return producaoController.postaOrdenha(producao);
    }

    @DeleteMapping("/producao")
    public void deletaProducao(@RequestBody Ordenha producao){
        producaoController.excluirOrdenha(producao); 
    }

    @PutMapping("/producao")
    public Ordenha atualizaNascimento(@RequestBody Ordenha producao){
       return  producaoController.editaOrdenha(producao);
    }



}