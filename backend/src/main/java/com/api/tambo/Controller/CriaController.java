package com.api.tambo.Controller;

//comunica com banco

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.api.tambo.Entity.Cria;
import com.api.tambo.Repository.CriaRepository;

@Controller
public class CriaController {

@Autowired
private CriaRepository criarepositorio;

public List<Cria>listaCrias(){
	return criarepositorio.findAll();
}

public Cria buscarCria(int id){
	  return criarepositorio.findById(id);
}


public Cria postaCria(Cria cria){
    return criarepositorio.save(cria);
}

public void excluiCria(Cria cria){
    criarepositorio.delete(cria);
}


public Cria editaCria(Cria cria){
   return  criarepositorio.save(cria);
}












}
