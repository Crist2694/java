package com;

public abstract class Calculadora {
	
	String marca, color, modelo;
	int numeroBotones;
	int digitosDisplay;
	public Calculadora() {
		super();
	}
	public Calculadora(String marca, String color, String modelo, int numeroBotones, int digitosDisplay) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.numeroBotones = numeroBotones;
		this.digitosDisplay = digitosDisplay;
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
	public int getNumeroBotones() {
		return numeroBotones;
	}
	public void setNumeroBotones(int numeroBotones) {
		this.numeroBotones = numeroBotones;
	}
	public int getDigitosDisplay() {
		return digitosDisplay;
	}
	public void setDigitosDisplay(int digitosDisplay) {
		this.digitosDisplay = digitosDisplay;
	}
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", numeroBotones="
				+ numeroBotones + ", digitosDisplay=" + digitosDisplay + ", getMarca()=" + getMarca() + ", getColor()="
				+ getColor() + ", getModelo()=" + getModelo() + ", getNumeroBotones()=" + getNumeroBotones()
				+ ", getDigitosDisplay()=" + getDigitosDisplay() + "]";
	}
//	
//	public abstract double sumar(int a, double b);
//	public abstract double restar(double a, int b);
//	public abstract double multiplicar(double a, double b);
//	public abstract double dividir(int a, int b);
}
