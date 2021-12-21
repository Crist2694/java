package com;

import java.util.Scanner;

//Crea un programa que pida al usuario dos numeros y muestre el resultado de su division. Si el segundo numero es 0 debe mostrar un error.

public class Principal4 {
	 public static void main(String[] args) {
		 System.out.println ("Ejercicio4");
		 System.out.println("Introduzca el dividendo");
		 @SuppressWarnings("resource")
		 Scanner leernum = new Scanner(System.in);
		 int a = leernum.nextInt();
		 // System.out.println("Usted ingreso: " + a);	
		 System.out.println("Introduzca el divisor");
		 int b = leernum.nextInt();
		 if(b == 0 ) {
			 System.out.println("Error");
		 }else
		 {
			 int div = a / b;
			 System.out.println("El resultado es: " + div);
		 }
		 
	 }
}
