package com;

import java.util.Scanner;
/*
 * Realizar una clase que modele un celular
 *  - modelar la clase
 *  - realizar clase principal
 *  - realizar un menu
 *  1.- Registrar cuantos celulares vas a registrar
 *  2.- Registrar los celulares
 *  3.- Buscar un celular por marca
 *  4.- Eliminar un celular por modelo .. para eliminar se nulea el contenido arr[i] = null;
 *  5.- Mostrar todos los celulares.
 *  
 *  Scanner. 
 *  arrays, if, instanciacion de un objeto
 *  ciclicas - do,while
 *  
 * 
 * 
 */

public class Principal {
	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		Scanner sn1 = new Scanner(System.in);
		int ncelulares = 0, i, opc, marca;
		System.out.println("Cuantos celulares deseas registrar?");
		ncelulares = sn.nextInt();
		Celular[]  arrayObjetos = new Celular[ncelulares];
		for(i=0; i<arrayObjetos.length; i++) {
			
			System.out.println("Ingrese la marca: 1. moto 2. samsung \n" );
			marca = sn.nextInt();
			
			System.out.println("Ingrese el modelo");
			String modelo = sn1.nextLine();
			arrayObjetos[i] = new Celular(marca, modelo); 

			System.out.println(arrayObjetos[i]);
			
		}
		do {
			System.out.println("<----------WELCOME---------->");
			System.out.println("<-----------Menu------------>");
			System.out.println("1.- Buscar celulares");
			System.out.println("2.- Eliminar celular");
			System.out.println("3.- Mostrar celulares");
			System.out.println("0.- Salir");
			System.out.println("<-----------Menu------------>");
			opc = sn.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Buscar celulares");
				System.out.println("Cual es el modelo que quiere buscar?");
				String buscarModelo = sn1.nextLine();
				for (i = 0; i < arrayObjetos.length; i++) {
					if (arrayObjetos[i].getModelo().equals(buscarModelo)) {
						System.out.println("Celular " + arrayObjetos[i]);
					}
					else {
						//System.out.println("Lo sentimos, no se ha encontrado nada... upsis");
					}
				}
				break;
				
			case 2:
				System.out.println("Eliminar celular");
				System.out.println("Cual es el celular que quiere eliminar?");
				String eliminarCelular = sn1.nextLine();
				for (i = 0; i < arrayObjetos.length; i++) {
					if (arrayObjetos[i].getModelo().equals(eliminarCelular)) {
						arrayObjetos[i] = null;
						System.out.println("Se ha eliminado el celular");
					}
					else
					{
						//System.out.println("Upsis");
					}
				}
				break;
			case 3:
				System.out.println("Ver celulares guardados");
				for(i=0; i<arrayObjetos.length; i++) {

					System.out.println(arrayObjetos[i]);
				}
				break;
					
			default:
				System.out.println("Ingrese una opción correcta");
				break;
			}
			
		}while(opc!=0);
	}
	
}
