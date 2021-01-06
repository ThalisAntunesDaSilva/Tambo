package com.api.tambo.Service;


import java.util.List;
import com.api.tambo.Controller.OrdenhaController;
import com.api.tambo.Controller.VacaController;
import com.api.tambo.Entity.Ordenha;
import com.api.tambo.Entity.Vaca;
import com.fasterxml.jackson.annotation.JsonBackReference;

import dto.Ordenhadto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

@RequestMapping(value = "/ordenhas")

public class OrdenhaResource {

    @Autowired
    OrdenhaController ordenhaController;
    
    VacaController vacaController;

    @JsonBackReference
    @GetMapping
    public List<Ordenha> listaProducao() {
        return ordenhaController.listaOrdenhas();

    }
    
    private Ordenha converter(Ordenhadto dto) {
    	Ordenha ordenha = new Ordenha();
    	ordenha.setId(dto.getId());
    	ordenha.setData(dto.getData());
    	ordenha.setOrdenha1(dto.getOrdenha1());
    	ordenha.setOrdenha2(dto.getOrdenha2());
    	ordenha.setMes(dto.getMes());
    	ordenha.setData(dto.getData());
    	Vaca vaca = (Vaca) vacaController.buscarVaca(dto.getVaca());
    	ordenha.setVaca(vaca);
    	
    	return ordenha;
    }
    
    
    
    @JsonBackReference
    @GetMapping("/ordenha/{id}")
    public Ordenha listaProducao(@PathVariable(value="id") int id) {
        return ordenhaController.buscarOrdenha(id);

    }
    
    @JsonBackReference
    @GetMapping("/ordenha/{mes}")
    public List<Ordenha>listaOrdenhaNoMes(@PathVariable(value="mes") int mes){
    	 return ordenhaController.listaOrdenhaNoMes(mes);
	}
    
    
    @JsonBackReference
    @PostMapping("/ordenha")
    public ResponseEntity salvaOrdenha(@RequestBody Ordenhadto dto){
        try {
    	
        Ordenha ordenha = converter(dto);
        ordenha = ordenhaController.postaOrdenha(ordenha);
        return ResponseEntity.ok(ordenha);
        
        }catch(Exception e){
        	return ResponseEntity.badRequest().body(e.getMessage());
        }
    	
    }

    @DeleteMapping("/ordenha")
    public void deletaProducao(@RequestBody Ordenha producao){
        ordenhaController.excluirOrdenha(producao); 
    }

    @PutMapping("/ordenha")
    public Ordenha atualizaNascimento(@RequestBody Ordenha producao){
       return  ordenhaController.editaOrdenha(producao);
    }



}