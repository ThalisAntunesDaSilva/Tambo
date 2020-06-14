package com.api.tambo.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="Produto")
public class Produto {
        
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String nome;
    private double valor;
    private int quantidade;
    private Date dataCompra;
    
    
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

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public Date getDataCompra() {
            return dataCompra;
        }

        public void setDataCompra(Date dataCompra) {
            this.dataCompra = dataCompra;
        }
    
    
    }
    
