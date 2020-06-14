package com.api.tambo.Service;

import java.util.List;

import com.api.tambo.Entity.Nascimento;
import com.api.tambo.Repository.NascimentoRepository;
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

@RequestMapping(value = "/nascimentos")

public class NascimentoResource {

    @Autowired
    NascimentoRepository nascimentoRepository;

 
    @GetMapping
    public List<Nascimento> listaNascimentos() {
        return nascimentoRepository.findAll();

    }

    @GetMapping("/nascimento/{id}")
    public Nascimento listaTouro(@PathVariable(value="id") int id) {
        return nascimentoRepository.findById(id);

    }

    @PostMapping("/nascimento")
    public Nascimento salvaNascimento(@RequestBody Nascimento nascimento){
        return nascimentoRepository.save(nascimento);
    }

    @DeleteMapping("/nascimento")
    public void deletaNascimento(@RequestBody Nascimento nascimento){
        nascimentoRepository.delete(nascimento);
    }

    @PutMapping("/nascimento")
    public Nascimento atualizaNascimento(@RequestBody Nascimento nascimento){
       return  nascimentoRepository.save(nascimento);
    }



}