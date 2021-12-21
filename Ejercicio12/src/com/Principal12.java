package com;

import java.util.GregorianCalendar;
import java.util.Scanner;

//Determina si el año es bisiesto

public class Principal12 {
	public static void main(String[] args) {
		Scanner leeranio = new Scanner(System.in);
		
		System.out.println("Introduce el año");
		int anio = leeranio.nextInt();
		
		GregorianCalendar calendario = new GregorianCalendar();
		
		if(calendario.isLeapYear(anio)) {
			System.out.println("El año " + anio + " es bisiesto" );
		}else {
			System.out.println("El año " + anio + " no es bisiesto");
		}
	}
}
