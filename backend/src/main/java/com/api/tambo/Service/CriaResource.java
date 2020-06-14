package com.api.tambo.Service;

import java.util.List;

import com.api.tambo.Entity.Cria;
import com.api.tambo.Repository.CriaRepository;

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

@RequestMapping(value = "/crias")

public class CriaResource {

    @Autowired
    CriaRepository criaRepository;

 
    @GetMapping
    public List<Cria> listaCrias() {
        return criaRepository.findAll();

    }

    @GetMapping("/cria/{id}")
    public Cria listaCria(@PathVariable(value="id") int id) {
        return criaRepository.findById(id);

    }

    @PostMapping("/cria")
    public Cria salvaTouro(@RequestBody Cria cria){
        return criaRepository.save(cria);
    }

    @DeleteMapping("/cria")
    public void deletaCria(@RequestBody Cria cria){
        criaRepository.delete(cria);
    }

    @PutMapping("/cria")
    public Cria atualizaCria(@RequestBody Cria cria){
       return  criaRepository.save(cria);
    }



}