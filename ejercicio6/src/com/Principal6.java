package com;

import java.util.Scanner;

//Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayuscula
public class Principal6 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String cadena;
		
		//Solicitud de datos del usaurio
		System.out.println("Ejercicio 6");
		System.out.println("Inroduce una cadena");
		cadena = scanner.nextLine();
		
		//Algoritmo
		/* Leer cadena 
		 * Calcula
		 *  si longitud de la cadena es diferente a 1 ---> No es una letra en mayuscula
		 *  si cadena > A y <z  --->  Es una letra en mayuscula
		 *  si no --> No es una letra en mayuscula
		 *  mostrar resultado
		 */
		
		if(cadena.length() !=1) {
			System.out.println("La cadena es una letra mayuscula");
		}else if((cadena.compareTo("A")) >=0 && (cadena.compareTo("Z")<=0)) {
			System.out.println("La cadena es una letra mayuscula");
		}else {
			System.out.println("La cadena no es una letra mayuscula");
		}
	}

}
