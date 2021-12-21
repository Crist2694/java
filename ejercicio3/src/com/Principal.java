package com;

import java.util.Scanner;

//Realiza un programa que pida un numero por el teclado y nos indique si es par o impar
public class Principal {
	public static void main(String[] args) {
	
		 System.out.println ("Ejercicio3");
		 System.out.println("Introduzca un numero: ");
		 @SuppressWarnings("resource")
		 Scanner leernum = new Scanner(System.in);
		 int a = leernum.nextInt();
		 //System.out.println("Usted ingreso: " + a);
		 
		 if(a %2 == 0 ) {
			 System.out.println("El numero " + a + " es par");
		 }else {
			 System.out.println("El numero " + a + " es impar");
		 }
	}

}
