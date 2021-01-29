package com.api.tambo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.api.tambo.Entity.Compra;
import com.api.tambo.Repository.CompraRepository;

@Controller
public class CompraController {
	

	@Autowired
	private CompraRepository comprarepositorio;

	public List<Compra>listaCompras(){
		return comprarepositorio.findAll();
	}

	public Compra buscarCompra(int id){
		  return comprarepositorio.findById(id);
	}


	public Compra postaCompra(Compra compra){
	    return comprarepositorio.save(compra);
	}

	public void excluiCompra(Compra compra){
	    comprarepositorio.delete(compra);
	}


	public Compra editaCompra(Compra compra){
	   return  comprarepositorio.save(compra);
	}


	}


