package com;

public class Principal {
	public static void main(String[] args) {
		Medico m = new Medico();
		
		m.setTitulo("Medico Cirujano");
		m.setCarrera("Medicina");
		
		m.trabajar();
		
		Arquitecto a = new Arquitecto();
		
		a.setTitulo("Lic. Arquitectura");
		a.setCarrera("Arquitectura");
		a.trabajar();
	}
}
