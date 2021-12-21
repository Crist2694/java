package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//solo esta indicado su tamaño, pero sin valores
		//String m[]= new String[10];
		
//		//Agregar valor manualmente a una posicion del array
//		m[0]="1";
//		m[1]="2";
//		m[2]="3";
//		m[3]="4";
//		m[4]="5";
//		m[5]="6";
//		m[6]="7";
//		m[7]="8";
//		m[8]="9";
//		m[9]="10";
//		
//		//Array de enteros
//		int [] enteros = new int[5];
//		
//		enteros[0]=1;
//		enteros[1]=2;
//		enteros[2]=3;
//		enteros[3]=4;
//		enteros[4]=5;
//		
////		
////	De una serie de n numeros, separar y agregar a un array aquellos que
////	sean multiplos de 3
////	Almacenar temporalmente aquellos que lo sean, para despues inicializar un array 
//		y agregarlos a el.
//		//por ultimo, imprimir el contenido de ese array.
////		
		
	
		
		
		Scanner leer = new Scanner(System.in);
//		System.out.println("Cuantos numeros se desean ingresar?");
//		int n=leer.nextInt();		
//		//System.out.println(n);
//		int []multiplos = new int[n];
//		int cantmultiplo = 0;
//		int i=0;
//		
//		do {
//			i++;
//			System.out.println("Ingrese el numero");
//			int numero = leer.nextInt();
//			
//			if(numero%3 == 0) {
//				multiplos[i] = numero;
//				cantmultiplo++;
//			}else {
//				System.out.println("El numero no es multiplo");
//			}
//			
//		}while(i<=multiplos.length);
//		System.out.println("Solo " + cantmultiplo + " fueron multiplo de 3");
//		
//		
		System.out.println("Cuantos numeros se desean ingresar?");
		int n = leer.nextInt();
		System.out.println("La cantidad de numeros es: "+n);
		int [] multiplos = new int[n];
		String cadena = "";
		String contenedor = "";
		for(int i=0; i<n; i++) {
			System.out.println("Ingrese el numero " );
			multiplos [i]= leer.nextInt();
			cadena += String.valueOf(multiplos[i]+ ",");
			if(multiplos[i] %3 == 0) {
				contenedor += String.valueOf(multiplos[i])+",";
			}else {
				System.out.println("El numero no es multiplo de 3");
			}

		}
		System.out.println("el arreglo fue: " + cadena);
	System.out.println("Solo " +contenedor + " fueron multiplos de 3");
		
	}

}
