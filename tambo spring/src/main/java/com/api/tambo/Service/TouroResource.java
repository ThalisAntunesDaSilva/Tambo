package com.api.tambo.Service;

import java.util.List;

import com.api.tambo.Entity.Touro;
import com.api.tambo.Repository.TouroRepository;

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

@RequestMapping(value = "/touros")

public class TouroResource {

    @Autowired
    TouroRepository touroRepository;

 
    @GetMapping
    public List<Touro> listaTouros() {
        return touroRepository.findAll();

    }

    @GetMapping("/touro/{id}")
    public Touro listaTouro(@PathVariable(value="id") int id) {
        return touroRepository.findById(id);

    }

    @PostMapping("/touro")
    public Touro salvaTouro(@RequestBody Touro touro){
        return touroRepository.save(touro);
    }

    @DeleteMapping("/touro")
    public void deletaTouro(@RequestBody Touro touro){
        touroRepository.delete(touro);
    }

    @PutMapping("/touro")
    public Touro atualizaTouro(@RequestBody Touro touro){
       return  touroRepository.save(touro);
    }



}