package com.api.tambo.Service;

import java.util.List;

import com.api.tambo.Entity.Vaca;
import com.api.tambo.Repository.VacaRepository;

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

@RequestMapping(value = "/vacas")

public class VacaResource {

    @Autowired
    VacaRepository vacaRepository;
  

 
    @GetMapping
    public List<Vaca> listaVacas() {
        return vacaRepository.findAll();

    }

    @GetMapping("/vaca/{id}")
    public Vaca listaVaca(@PathVariable(value="id") final int id) {
        return vacaRepository.findById(id);

    }

    @PostMapping("/vaca")
    public Vaca salvaVaca(@RequestBody final Vaca vaca) {
        return vacaRepository.save(vaca);
    }

    @DeleteMapping("/vaca")
    public void deletaVaca(@RequestBody final Vaca vaca) {
        vacaRepository.delete(vaca);
    }

    @PutMapping("/vaca")
    public Vaca atualizaVaca(@RequestBody final Vaca vaca) {
       return  vacaRepository.save(vaca);
    }



}