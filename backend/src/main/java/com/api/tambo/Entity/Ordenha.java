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
import com.fasterxml.jackson.annotation.JsonCreator;


@Entity   
@Table(name="Ordenha")
public class Ordenha implements Serializable {
    
/**
 * 
 */
private static final long serialVersionUID = 1L;
        
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
   private Date data; 
   private float ordenha1;
   private float ordenha2;
  
   @ManyToOne
   @JoinColumn(name = "vaca")
   private Vaca vaca;
   private int mes;
   
   
   public Ordenha() {
	}
   
   @JsonCreator 
   public Ordenha(int id,Date data,float ordenha1,float ordenha2,Vaca vaca,int mes) {
	super();
	this.id = id;
	this.data = data;
	this.ordenha1 = ordenha1;
	this.ordenha2 = ordenha2;
	this.vaca = vaca;
	this.mes = mes;
}

		public int getId() {
           return id;
            
        }
    
        public void setId(int id) {
            this.id = id;
        }

        public float getOrdenha1() {
            return ordenha1;
        }

        public void setOrdenha1(float ordenha1) {
            this.ordenha1 = ordenha1;
        }

        public float getOrdenha2() {
            return ordenha2;
        }

        public void setOrdenha2(float ordenha2) {
            this.ordenha2 = ordenha2;
        }

		public Vaca getVaca() {
			return vaca;
		}

		public void setVaca(Vaca vaca) {
			this.vaca = vaca;
		}
        
		public float totalOrdenha() {
			return ordenha1 + ordenha2;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public int getMes() {
			return mes;
		}

		public void setMes(int mes) {
			this.mes = mes;
		}
        


    
       
    }
    
