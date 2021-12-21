package com;

import java.util.Scanner;

/* La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva
 * la cual se clasifica en tipos (A y B), ad�mas en tama�os (1 y 2). Cuando se realiza
 * la venta del producto esta es de un solo tipo y tama�o, se requiere determinar cuanto recibir� 
 * un productor por la uva que entrega en un embarque considerando lo siguiente:
 * 
 * si es de tipo A, se le cargan 20 c�ntesimos al precio inicial cuando es de tama�o 1 
 * y 30 c�ntesimos si es de tama�o 2
 * 
 * si es de tipo B, se le rebajan 30 c�ntesimos cuando es de tama�o 1 
 * y 50 c�ntesimos cuando es de tama�o 2
 * 
 */
public class Principal14 {
	
	public static void main(String[] args) {
		Scanner leerdatos = new Scanner(System.in);
		
		System.out.println("Ejercicio 14");
		System.out.println("Ingresa el tipo");
		String tipo = leerdatos.nextLine();
		System.out.println("Ingresa el tama�o");
		int tama�o = leerdatos.nextInt();
		
		int productoinicial = 100;
		int producto = 0;
		
		if(tipo.compareTo("A") >= 0) {
			if(tama�o == 1) {
				producto = productoinicial + 20;
				System.out.println("El costo es: " + producto);
			}
			else if(tama�o == 2) {
				producto = productoinicial + 30;
				System.out.println("El costo es: " + producto);
			}else {
				System.out.println("Ingrese un tama�o correcto");
			}
		}else if(tipo.compareTo("B") >= 0) {
			if(tama�o ==1) {
				producto = productoinicial - 30;
				System.out.println("El costo es: " + producto);
			}else if(tama�o == 2) {
				producto = productoinicial -50;
				System.out.println("El costo es: " + producto);
			}else {
				System.out.println("ingrese un tama�o correcto");
			}
		}else {
			System.out.println("Ingrese un tipo correcto");
		}
	}

}
