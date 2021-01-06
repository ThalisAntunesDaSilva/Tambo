package com.api.tambo.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity   
@Table(name="Vaca")
public class Vaca implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private String nome;
   private Date dataNascimento;
   private float producao;
   @OneToMany(mappedBy = "mae")
   private List<Cria>filhos = new ArrayList<>();
   
   @JsonManagedReference
   @OneToMany(mappedBy = "vaca")
   private List<Ordenha>ordenha = new ArrayList<>();
   
   
   
    public Vaca() {
	
}
    

	public Vaca(int id, String nome, Date dataNascimento, float producao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.producao = producao;
	}


	public int getId() {
           return id;
       }
   
       public void setId(int id) {
           this.id = id;
       }
         
       public String getNome() {
           return nome;
       }
   
       public void setNome(String nome) {
           this.nome = nome;
       }

	public float getProducao() {
		return producao;
	}

	public void setProducao(float producao) {
		this.producao = producao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
	public List<Cria> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<Cria> filhos) {
		this.filhos = filhos;
	}
	


}
    
