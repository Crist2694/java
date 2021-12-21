package com;

public class Television {
	public String marca;
	public double tamaño;
	public String sistema;
	
	
	public Television() {
		
	}


	public Television(String marca, double tamaño, String sistema) {
		super();
		this.marca = marca;
		this.tamaño = tamaño;
		this.sistema = sistema;
	}
	
	public void setMarca(String m) {
		this.marca = m;
	}
	
	public String getMarca() {
		return marca;
	}


	public double getTamaño() {
		return tamaño;
	}


	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
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
		return "Television [marca=" + marca + ", tamaño=" + tamaño + ", sistema=" + sistema + "]";
	}
	
	//comportamiento
	public void verTelevision() {
		System.out.println("ver television");
	}
	
	
	
	
}
