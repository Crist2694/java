package com;

import java.util.Scanner;

/* La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva
 * la cual se clasifica en tipos (A y B), adémas en tamaños (1 y 2). Cuando se realiza
 * la venta del producto esta es de un solo tipo y tamaño, se requiere determinar cuanto recibirá 
 * un productor por la uva que entrega en un embarque considerando lo siguiente:
 * 
 * si es de tipo A, se le cargan 20 céntesimos al precio inicial cuando es de tamaño 1 
 * y 30 céntesimos si es de tamaño 2
 * 
 * si es de tipo B, se le rebajan 30 céntesimos cuando es de tamaño 1 
 * y 50 céntesimos cuando es de tamaño 2
 * 
 */
public class Principal14 {
	
	public static void main(String[] args) {
		Scanner leerdatos = new Scanner(System.in);
		
		System.out.println("Ejercicio 14");
		System.out.println("Ingresa el tipo");
		String tipo = leerdatos.nextLine();
		System.out.println("Ingresa el tamaño");
		int tamaño = leerdatos.nextInt();
		
		int productoinicial = 100;
		int producto = 0;
		
		if(tipo.compareTo("A") >= 0) {
			if(tamaño == 1) {
				producto = productoinicial + 20;
				System.out.println("El costo es: " + producto);
			}
			else if(tamaño == 2) {
				producto = productoinicial + 30;
				System.out.println("El costo es: " + producto);
			}else {
				System.out.println("Ingrese un tamaño correcto");
			}
		}else if(tipo.compareTo("B") >= 0) {
			if(tamaño ==1) {
				producto = productoinicial - 30;
				System.out.println("El costo es: " + producto);
			}else if(tamaño == 2) {
				producto = productoinicial -50;
				System.out.println("El costo es: " + producto);
			}else {
				System.out.println("ingrese un tamaño correcto");
			}
		}else {
			System.out.println("Ingrese un tipo correcto");
		}
	}

}
