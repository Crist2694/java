package com;

public class Celular {
	
	private int marca;
	private String modelo;
	
	public Celular(int marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Celular() {
		
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + "]";
	}
	
	
	
	
	
	
}
