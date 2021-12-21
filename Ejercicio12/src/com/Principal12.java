package com;

import java.util.GregorianCalendar;
import java.util.Scanner;

//Determina si el a�o es bisiesto

public class Principal12 {
	public static void main(String[] args) {
		Scanner leeranio = new Scanner(System.in);
		
		System.out.println("Introduce el a�o");
		int anio = leeranio.nextInt();
		
		GregorianCalendar calendario = new GregorianCalendar();
		
		if(calendario.isLeapYear(anio)) {
			System.out.println("El a�o " + anio + " es bisiesto" );
		}else {
			System.out.println("El a�o " + anio + " no es bisiesto");
		}
	}
}
