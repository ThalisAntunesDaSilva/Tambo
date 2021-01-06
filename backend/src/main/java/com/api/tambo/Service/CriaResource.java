package com.api.tambo.Service;

import java.util.List;

import com.api.tambo.Controller.CriaController;
import com.api.tambo.Entity.Cria;
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
    CriaController criaController;

 
    @GetMapping
    public List<Cria> listaCrias() {
        return criaController.listaCrias();

    }

    @GetMapping("/cria/{id}")
    public Cria listaCria(@PathVariable(value="id") int id) {
        return criaController.buscarCria(id);

    }

    @PostMapping("/cria")
    public Cria salvaCria(@RequestBody Cria cria){
        return criaController.postaCria(cria);
    }

    @DeleteMapping("/cria")
    public void deletaCria(@RequestBody Cria cria){
        criaController.excluiCria(cria);
    }

    @PutMapping("/cria")
    public Cria atualizaCria(@RequestBody Cria cria){
       return  criaController.editaCria(cria);
    }



}