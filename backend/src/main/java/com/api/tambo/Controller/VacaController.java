package com.api.tambo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.api.tambo.Entity.Vaca;
import com.api.tambo.Repository.VacaRepository;

@Controller
public class VacaController {
	
	@Autowired
	private VacaRepository vacaRepositorio;

	public List<Vaca>listaVacas(){
		return vacaRepositorio.findAll();
	}

	public Vaca buscarVaca(int id){
		  return vacaRepositorio.findById(id);
	}


	public Vaca postaVaca(Vaca vaca){
	    return vacaRepositorio.save(vaca);
	}

	public void excluiVaca(Vaca vaca){
		vacaRepositorio.delete(vaca);
	}


	public Vaca editaVaca(Vaca vaca){
	   return  vacaRepositorio.save(vaca);
	} 

	}

	
	

