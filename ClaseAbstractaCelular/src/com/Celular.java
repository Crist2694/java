package com;

public abstract class Celular {
	String marca, color, modelo;
	int botones;
	
	public Celular() {
	
	}

	public Celular(String marca, String color, String modelo, int botones) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.botones = botones;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getBotones() {
		return botones;
	}

	public void setBotones(int botones) {
		this.botones = botones;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", botones=" + botones
				+ ", getMarca()=" + getMarca() + ", getColor()=" + getColor() + ", getModelo()=" + getModelo()
				+ ", getBotones()=" + getBotones() + "]";
	}
	
	
}
