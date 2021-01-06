package com.api.tambo.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.api.tambo.Entity.Ordenha;
import com.api.tambo.Repository.OrdenhaRepository;

@Controller
public class OrdenhaController {

	
	
	@Autowired
	private OrdenhaRepository ordenhaRepositorio;

	public List<Ordenha>listaOrdenhas(){
		return ordenhaRepositorio.findAll();
	}
	
	
	
	public List<Ordenha>listaOrdenhaNoMes(int mes){
		List<Ordenha> ordenhasdomes = new ArrayList<>();
		List<Ordenha> todasordenhas = ordenhaRepositorio.findAll();
		
		for(Ordenha o : todasordenhas) {
			if(o.getMes() == mes) {
				ordenhasdomes.add(o);
			}
		
		} return ordenhasdomes;
	}
	
	
	

	public Ordenha buscarOrdenha(int id){
		  return ordenhaRepositorio.findById(id);
	}


	public Ordenha postaOrdenha(Ordenha ordenha){
	    return ordenhaRepositorio.save(ordenha);
	}

	public void excluirOrdenha(Ordenha ordenha){
	    ordenhaRepositorio.delete(ordenha);
	}


	public Ordenha editaOrdenha(Ordenha ordenha){
	   return  ordenhaRepositorio.save(ordenha);
	}
	 }
