package com.api.tambo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="Producao")
public class Producao {
        
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private float ordenha1;
    private float ordenha2;
    
    
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


    
       
    }
    
