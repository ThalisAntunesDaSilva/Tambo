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

@Entity
@Table(name="Touro")
public class Touro implements Serializable {
    
/**
 * 
 */
private static final long serialVersionUID = 1L;
    
@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)

private int id;
private String nome;
private Date dataNascimento;

@OneToMany(mappedBy = "pai")
private List<Cria>filhos = new ArrayList<>();






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
        
    

        
