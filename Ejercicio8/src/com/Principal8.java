package com;

import java.util.Scanner;

public class Principal8 {
	
	/* Realiza un programa que calcule la aceptación de una solicitud con base
	 * a los sig. parametros: edad, nota y sexo
	 * Mínimo: Nota(5), edad(18), sexo M -> Posible
	 * Minimo: Nota(5), edad(18), sexo F -> Aceptado
	 * Otros casos -> No aceptado
	 */
	
	public static void main(String[] args) {
		 System.out.println ("Ejercicio8");
		 System.out.println("Introduzca la nota: ");
		 @SuppressWarnings("resource")
		 Scanner leerdato = new Scanner(System.in);
		 @SuppressWarnings("resource")
		Scanner leersexo = new Scanner (System.in);
		 
		 String sexo;
		 int nota = leerdato.nextInt();
		 System.out.println("Introduzca la edad:");
		 int edad = leerdato.nextInt();
		 System.out.println("Introduzca el sexo (M o F)");
		 sexo = leersexo.nextLine();
		 
		// System.out.println("La nota es: " + nota + "La edad es: " + edad+ " el sexo es: "+sexo);
		 
		 if(!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
			 System.out.println("El valor que ingresaste es incorretcto.\n" +
		     "por favor ingreselo bien");
		 }else if((nota >=5) && (edad >= 18) && (sexo.toUpperCase().equals("M")) ) {
			 System.out.println("Posible");
		 }else if((nota >=5) && (edad >= 18) && (sexo.toUpperCase().equals("F")) ) {
			 System.out.println("Aceptado");
		 }else {
			 System.out.println("no aceptado");
		 }
		 
		 /*
		 if((nota >= 5) && (edad >= 18) && (sexo == "m")) {
			 System.out.println("Posible");
		 }else if((nota >= 5) && (edad >= 18) && sexo == "" ) {
			 System.out.println("Aceptado");
		 }else {
			 System.out.println("no aceptado");
		 }*/
	}

}
