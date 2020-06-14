package com.api.tambo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="LeiteConsumido")
public class LeiteConsumido {
        
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private float qtEmpresa;
    private float qtPessoas;
    private float qtAleitados;
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }

        public float getQtEmpresa() {
            return qtEmpresa;
        }

        public void setQtEmpresa(float qtEmpresa) {
            this.qtEmpresa = qtEmpresa;
        }

        public float getQtPessoas() {
            return qtPessoas;
        }

        public void setQtPessoas(float qtPessoas) {
            this.qtPessoas = qtPessoas;
        }

        public float getQtAleitados() {
            return qtAleitados;
        }

        public void setQtAleitados(float qtAleitados) {
            this.qtAleitados = qtAleitados;
        }
    
      
    }
    
