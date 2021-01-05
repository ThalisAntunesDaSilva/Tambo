package com.api.tambo.Entity;

	import java.util.Date;

import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity   
	@Table(name="Compra")
	public class Compra  {
	        
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int id; 
	   private String produto;
	   private double valor;
	   private Date data;
	   private int quantidade;
	
	   
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
