package com;

public abstract class Profesionista {
	/*
	 * una clase abstracta es aquella que contiene al menos
	 * un metodo abstracto 
	 */
	
	String titulo;
	String carrera;
	
	public Profesionista() {
		super();
	}
	public Profesionista(String titulo, String carrera) {
		
		this.titulo = titulo;
		this.carrera = carrera;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	@Override
	public String toString() {
		return "Profesionista [titulo=" + titulo + ", carrera=" + carrera + ", getTitulo()=" + getTitulo()
				+ ", getCarrera()=" + getCarrera() + "]";
	}
	public abstract void trabajar();
	
	
	
}
