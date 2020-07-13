package com.api.tambo.Service;

import java.util.List;

import com.api.tambo.Entity.LeiteConsumido;
import com.api.tambo.Repository.LeiteConsumidoRepository;
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

@RequestMapping(value = "/leiteConsumidos")

public class LeiteConsumidoResource {

    @Autowired
    LeiteConsumidoRepository leiteConsumidoRepository;

 
    @GetMapping
    public List<LeiteConsumido> listaLeiteConsumido() {
        return leiteConsumidoRepository.findAll();

    }

    @GetMapping("/leiteConsumido/{id}")
    public LeiteConsumido listaLeiteConsumido(@PathVariable(value="id") int id) {
        return leiteConsumidoRepository.findById(id);

    }

    @PostMapping("/leiteConsumido")
    public LeiteConsumido salvaLeiteConsumido(@RequestBody LeiteConsumido leiteConsumido){
        return leiteConsumidoRepository.save(leiteConsumido);
    }

    @DeleteMapping("/leiteConsumido")
    public void deletaLeiteConsumido(@RequestBody LeiteConsumido leiteConsumido){
        leiteConsumidoRepository.delete(leiteConsumido);
    }

    @PutMapping("/leiteConsumido")
    public LeiteConsumido atualizaLeiteConsumido(@RequestBody LeiteConsumido leiteConsumido){
       return  leiteConsumidoRepository.save(leiteConsumido);
    }



}