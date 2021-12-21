package com;

public class Television {
	public String marca;
	public double tama�o;
	public String sistema;
	
	
	public Television() {
		
	}


	public Television(String marca, double tama�o, String sistema) {
		super();
		this.marca = marca;
		this.tama�o = tama�o;
		this.sistema = sistema;
	}
	
	public void setMarca(String m) {
		this.marca = m;
	}
	
	public String getMarca() {
		return marca;
	}


	public double getTama�o() {
		return tama�o;
	}


	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}


	public String getSistema() {
		return sistema;
	}


	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	//toString
	@Override
	public String toString() {
		return "Television [marca=" + marca + ", tama�o=" + tama�o + ", sistema=" + sistema + "]";
	}
	
	//comportamiento
	public void verTelevision() {
		System.out.println("ver television");
	}
	
	
	
	
}
