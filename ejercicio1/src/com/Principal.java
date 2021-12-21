package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 System.out.println ("Ejercicio1");
		 System.out.println("Introduzca el primer numero");
		 @SuppressWarnings("resource")
		 Scanner leernum = new Scanner(System.in);
		 int a = leernum.nextInt();
		 // System.out.println("Usted ingreso: " + a);
		 System.out.println("Introduzca el segundo numero");
		 int b = leernum.nextInt();
		 //System.out.println("Usted ingreso: " + b);
		 
		 if(a > b) {
			 System.out.println( a + " es mayor que " + b);
		 } else if(b > a) {
			 System.out.println(b + " es mayor que " +a);
		 }else {
			 System.out.println(a + " y " + b + " son iguales");
		 }
	}
}
