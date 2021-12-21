package com;

import java.util.Scanner;

/*Realiza un programa que pida los puntos centrales de dos circunferencias (x1, y1),
 * (x2, y2) y los radios de las mismas (r1, r2). El programa debe 
 * clasificar segun corresponda como exteriores, tengentes exteriores, secantes,
 * tangentes interiores, interiores o concentricas. 
 * 
 * 
 * Primero requerimos x1, y1, x2, y2 y los radios r1 y r2 de dos circunferencias y esta los pueda 
 * clasificar. en uno de los estados.
 * 
 */
public class Principal10 {
	public static void main(String[] args) {
		Scanner leerdatos = new Scanner(System.in);
		int x1, y1, x2, y2, r1, r2;
		double distancia;
		
		
		//Solicitud de datos
		System.out.println("Ingrese el valor de x1");
		x1 = leerdatos.nextInt();
		System.out.println("Ingrese el valor de y1");
		y1 = leerdatos.nextInt();
		System.out.println("Ingrese el valor de x2");
		x2 = leerdatos.nextInt();
		System.out.println("Ingrese el valor de y2");
		y2 = leerdatos.nextInt();
		System.out.println("Ingrese el valor del radio 1");
		r1 =  leerdatos.nextInt();
		System.out.println("Ingrese el valor del radio 2");
		r2 = leerdatos.nextInt();
		
		
		//Se realiza el calculo de la distancia entre ambas circunferencias
		distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		//se realiza la comparación y se muestra en pantalla
		if(distancia == 0) {
			System.out.println("Concentricas");
		}else if(distancia > (r1+r2)) {
			System.out.println("Exteriores");
		}else if((distancia >0)&& distancia < Math.abs(r1-r2)) {
			System.out.println("Interiores");
		}else if( distancia == (r1+r2)) {
			System.out.println("Tangentes exteriores");
		}else if(distancia == Math.abs(r1-r2)) {
			System.out.println("Tangentes interiores");
		}else if(distancia < (r1+r2) && distancia > Math.abs(r1-r2)) {
			System.out.println("Circunferencias secantes");
		}
	}

}
