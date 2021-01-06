package dto;

import java.util.Date;

public class Ordenhadto {

	 private int id;
	   private Date data; 
	   private float ordenha1;
	   private float ordenha2;
	   private int vaca;
	   private int mes;
	
	   public Ordenhadto() {
		   
	   }

	public Ordenhadto(int id, Date data, float ordenha1, float ordenha2, int idvaca, int mes) {
		this.id = id;
		this.data = data;
		this.ordenha1 = ordenha1;
		this.ordenha2 = ordenha2;
		this.vaca = idvaca;
		this.mes = mes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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

	public int getVaca() {
		return vaca;
	}

	public void setVaca(int vaca) {
		this.vaca = vaca;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	   
	
	
}
