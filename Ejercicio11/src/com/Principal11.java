package com;

import java.util.Scanner;

/*Realiza un programa que clasifique un triangulo tras recibir el tamaño de sus lados
 * Se debe clasificar como:
 * - Triangulo rectangulo
 * - Triangulo Isósceles
 * - Equilátero
 * - Escaleno
 * 
 * Primero tiene que leer 3 datos de entrada: A, B, C, estos son las dimensiones de los lados
 * si se cumple el teorema de pitagoras entonces es un Triángulo Rectángulo (true = rectanculo)
 * Si dos lados del triangulo son iguales es isósceles
 * si tres lados son iguales, es equilatero
 * si no se cumple es escaleno
 * 
 * Pd. La hipotenusa es el lado más largo
 */

public class Principal11 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int ladoA, ladoB, ladoC;
		boolean rectangulo = false;
		
		
		//solicitud de datos
		System.out.println("Ejercicio 11");
		System.out.println("Clasificación de un tríángulo");
		System.out.println("Ingrese el valor del lado A");
		ladoA = datos.nextInt();
		System.out.println("Ingrese el valor del lado B");
		ladoB = datos.nextInt();
		System.out.println("Ingrese el valor del lado C");
		ladoC = datos.nextInt();
		
		/*Realizamos los calculos y los mostramos en pantalla
		 * Primero debemos encontrar la hipotenusa.
		 * Encontrando la hipotenusa comprobamos el teorema de pitagoras
		 * si se cumple el triángulo rectángulo pasa a true. 
		 */
		
		if(ladoA > ladoB && ladoA > ladoB) {
			if((Math.pow(ladoA,2))== (Math.pow(ladoB, 2)) + (Math.pow(ladoC, 2))) {
				rectangulo = true;
			}
		}else if( ladoB > ladoA && ladoB > ladoC) {
			if( (Math.pow(ladoB, 2))==(Math.pow(ladoA, 2)) + (Math.pow(ladoC, 2))) {
				rectangulo = true;
			}
		}else if( ladoC > ladoA && ladoC > ladoB ) {
			if( (Math.pow(ladoC, 2))== (Math.pow(ladoA,2)) + (Math.pow(ladoB,2)) ) {
				rectangulo = true;
			}
		}
		
		/* ya que sabemos que es un triangulo rectangulo
		 * continuamos con el resto de las comprobaciones 
		 */
		
		//dos lados iguales
		if( (ladoA == ladoB && ladoA != ladoC) || (ladoA == ladoC && ladoA != ladoB) || (ladoB == ladoC && ladoB != ladoA))
		{
			if(rectangulo) {
				System.out.println("Es un triángulo rectángulo e isosceles");
			} else {
				System.out.println("Es un triángulo isosceles");
			}
		}
		// tres lados iguales
		else if (ladoA == ladoB && ladoB == ladoC) {
			if(rectangulo) {
				System.out.println("Es un triángulo rectángulo y equilatero");
			}else {
				System.out.println("Es un triángulo equilatero");
			}
		}
		else {
			if(rectangulo) {
				System.out.println("Es un triángulo rectángulo y escaleno");
			}else {
				System.out.println("Es un triángulo escaleno");
			}
		}		
	}
}
