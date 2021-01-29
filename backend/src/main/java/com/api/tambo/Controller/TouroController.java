package com.api.tambo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.api.tambo.Repository.TouroRepository;
import com.api.tambo.Entity.Touro;
import java.util.List;


@Controller
public class TouroController {

		@Autowired
		private TouroRepository touroRepositorio;

		public List<Touro>listaTouros(){
			return touroRepositorio.findAll();
		}

		@SuppressWarnings("unchecked")
		public List<Touro> buscarTouro(int id){
			  return (List<Touro>) touroRepositorio.findById(id);
		}


		public Touro postaTouro(Touro touro){
		    return touroRepositorio.save(touro);
		}

		public void excluiTouro(Touro touro){
			touroRepositorio.delete(touro);
		}


		public Touro editaVaca(Touro touro){
		   return  touroRepositorio.save(touro);
		} 

		}

		
		


	
	

