package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		int edad=26;
		int edades = 0;
		int edadpromedio =0;
		int i=1;
		int promedio = 0;
		
		do {
			
			System.out.println("introduzca edad");
			@SuppressWarnings("resource")
			Scanner leeredad = new Scanner(System.in);
			edades = leeredad.nextInt();
			 edadpromedio = edades+edadpromedio;
			promedio = edadpromedio/i; 
			
			System.out.println(i);
			System.out.println("el total de la edad es: " + edadpromedio);
			System.out.println("El promedio es: " + promedio);
			
			i++;
		}while(promedio <= 27);
		System.out.println("Promedio: " + promedio);
	}

}
