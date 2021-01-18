package com.api.tambo.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity   
@Table(name="Cria")
public class Cria  implements Serializable {
    
/**
 * 
 */
private static final long serialVersionUID = 1L;
        
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nome;
    private Date dataNascimento;
    @ManyToOne
    @JoinColumn(name = "idpai")
    private Touro pai;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idmae")
    private Vaca mae; 
  
    
    
    
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

		public Touro getPai() {
			return pai;
		}

		public void setPai(Touro pai) {
			this.pai = pai;
		}

		public Vaca getMae() {
			return mae;
		}

		public void setVaca(Vaca mae) {
			this.mae = mae;
		}
        
        
        
        
    }
    
