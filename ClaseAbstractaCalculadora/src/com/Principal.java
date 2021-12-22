package com;

public class Principal {
	public static void main(String[] args) {
		
		//modelar un telefono basico
		//modelar un smartphone
		// estructura, clase abstracta se hereda con dos clases usando 1 o más interfaces.
		
		CalculadoraBasica cb = new CalculadoraBasica();
		
		System.out.println("Suma: " + cb.sumar(2, 4));
		System.out.println("Restar: " + cb.restar(4, 2));
		System.out.println("Multiplicar: " + cb.multiplicar(2, 4));
		System.out.println("Dividir: " + cb.dividir(4, 2));
		
		System.out.println("<--------------------------------------------------->");
		
		CalculadoraCientifica cf = new CalculadoraCientifica();
		System.out.println("Suma: " + cf.sumar(2, 4));
		System.out.println("Restar: " + cf.restar(4, 2));
		System.out.println("Multiplicar: " + cf.multiplicar(2, 4));
		System.out.println("Dividir: " + cf.dividir(4, 2));
		
		System.out.println("Exponente: " + cf.elevarExponente(5, 3));
		System.out.println("Seno: " + cf.calculaSeno(45));
		System.out.println("Tangente: " + cf.CalculaTangente(45));
		System.out.println("Raiz Cuadrada: " + cf.raizCuadrada(90));
		
	}
}
