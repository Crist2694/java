package com;

public class AutoGasolina {
	
	/*
	 * LLantas
	 * Motor
	 * Largo
	 * ancho
	 * alto
	 * numasientos
	 * 
	 */
	
	//constante
	static final String COMBUSTIBLE = "Gasolina";
	
	public int llantas;
	public int motor;
	public double largo;
	public double ancho;
	public int numasientos;
	public String marca;
	public String color;
	public boolean estandar;
	
	
	public AutoGasolina() {
		
	}


	public AutoGasolina(int llantas, int motor, double largo, double ancho, int numasientos, String marca, String color,
			boolean estandar) {
		super();
		this.llantas = llantas;
		this.motor = motor;
		this.largo = largo;
		this.ancho = ancho;
		this.numasientos = numasientos;
		this.marca = marca;
		this.color = color;
		this.estandar = estandar;
	}


	public int getLlantas() {
		return llantas;
	}


	public void setLlantas(int llantas) {
		this.llantas = llantas;
	}


	public int getMotor() {
		return motor;
	}


	public void setMotor(int motor) {
		this.motor = motor;
	}


	public double getLargo() {
		return largo;
	}


	public void setLargo(double largo) {
		this.largo = largo;
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public int getNumasientos() {
		return numasientos;
	}


	public void setNumasientos(int numasientos) {
		this.numasientos = numasientos;
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


	public boolean isEstandar() {
		return estandar;
	}


	public void setEstandar(boolean estandar) {
		this.estandar = estandar;
	}


	public static String getCombustible() {
		return COMBUSTIBLE;
	}

	//toString
	@Override
	public String toString() {
		return "AutoGasolina [llantas=" + llantas + ", motor=" + motor + ", largo=" + largo + ", ancho=" + ancho
				+ ", numasientos=" + numasientos + ", marca=" + marca + ", color=" + color + ", estandar=" + estandar
				+ "]";
	}
	
	
	
}
