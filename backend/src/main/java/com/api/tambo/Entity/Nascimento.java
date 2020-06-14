package com.api.tambo.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="Nascimento")
public class Nascimento {
        
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private Date dataCobrimento;
    private String cobrimento;
    private Date dataNascimento;
    
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }

        public Date getDataCobrimento() {
            return dataCobrimento;
        }

        public void setDataCobrimento(Date dataCobrimento) {
            this.dataCobrimento = dataCobrimento;
        }

        public String getCobrimento() {
            return cobrimento;
        }

        public void setCobrimento(String cobrimento) {
            this.cobrimento = cobrimento;
        }

        public Date getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(Date dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

      
    
      
    }
    
