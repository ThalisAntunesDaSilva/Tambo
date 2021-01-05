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
    private float ordenha1;
    private float ordenha2;
    private Vaca vaca;
    private Date data;
    private int mes;
    @ManyToOne
    @JoinColumn(name = "vaca")
    
    
     	
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
    
