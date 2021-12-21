package com;

import java.util.Scanner;

/* Realiza un programa que calcule la potencia de un numero, dado este y su exponente
*Pueden ocurrir tres casos
*Exponente sea positivo: imprime el resultado en pantalla
*Exponente sea 0: el resultado es 1
*El exponente sea negativo, el resultado es 1/potencia con el exponente positivo
*
**/
public class Principal7 {
	 public static void main(String args[]){
		 
		 System.out.println ("Ejercicio7");
		 System.out.println("Introduzca un numero: ");
		 @SuppressWarnings("resource")
		 Scanner leernum = new Scanner(System.in);
		 int number = leernum.nextInt();
		 System.out.println("Introduzca la potencia: ");
		 int power = leernum.nextInt();
		 double result = Math.pow(number,power);
		 if(power > 1) {
	        System.out.println("El resultado es: "+result);
	     }else if(power == 0) {
	    	 System.out.println("El resultado es 0");
	     }else if(power <= 0){
	    	 System.out.println("El resultado es: "+result);
	     }
	 }
}
