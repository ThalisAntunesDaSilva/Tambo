package com.api.tambo.Service;

import com.api.tambo.Controller.OrdenhaController;
import com.api.tambo.Controller.VacaController;
import com.api.tambo.Entity.Ordenha;
import java.util.List;
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

@RequestMapping(value = "/ordenhas")

public class OrdenhaResource {

    @Autowired
    OrdenhaController ordenhaController;
    
    VacaController vacaController;

    
    @GetMapping
    public List<Ordenha> listaProducao() {
        return ordenhaController.listaOrdenhas();

    }
    
 
    @GetMapping("/ordenha/{id}")
    public Ordenha listaProducao(@PathVariable(value="id") int id) {
        return ordenhaController.buscarOrdenha(id);

    }
    
    
    @GetMapping("/ordenha/{mes}")
    public List<Ordenha>listaOrdenhaNoMes(@PathVariable(value="mes") int mes){
    	 return ordenhaController.listaOrdenhaNoMes(mes);
	}
    
   
    
    @PostMapping("/ordenha")
    public Ordenha salvaOrdenha(@RequestBody Ordenha ordenha){
       return ordenhaController.postaOrdenha(ordenha);
    	
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