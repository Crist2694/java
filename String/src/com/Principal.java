package com;

public class Principal {
	public static void main(String[] args) {
		
		int x=0;
		String cadena = "Hoy es 15 de diciembre del 2021";
		
		//charAt 
		//nos manda el caracter de donde le indiquemos la posicion
		//System.out.println(cadena.charAt(0));
		
		//.lenght 
		//tamaño de la cadena
		//System.out.println(cadena.length());
		
		//substring
		//manda un string apartir de la posicion que le indiquemos
		//System.out.println(cadena.substring(10));
		
		//substring
		// manda un string apartir de la posicion que le indiquemos y hasta donde queremos que lo mande
		//System.out.println(cadena.substring(10, 15));
		
		//toLowerCase
		//manda la cadena en minusculas
		//System.out.println(cadena.toLowerCase());
		
		//toUpperCase
		//manda la cadena en mayusculas
		//System.out.println(cadena.toUpperCase());
		
		//equals 
		//compara y devuelve el valor verdadero
		//System.out.println(cadena.equals("Hoy es 15 de diciembre de 2021"));
		
		//compareto
		//
		//System.out.println(cadena.compareTo("Hoy"));
		
		//ciclos
		/* variable de control
		 * condicion a evaluar
		 * cambio de variable
		 * estructura ciclica definida
		 
		for(int i=0; i<10; i++) {
			System.out.println("foo " + i);
		}
		
		
		for(int i=20; i>0; i--)
		{
			System.out.println("foo2 " + i);
		}
		*/
		/* While
		 * 
		 * evalua la condicion desde el inicio (true, false)
		 * indefinido
		 */
		
		/* while(x<=30) {
			
			System.out.println("ok" + x);
			x++;
		}*/
		/*do while
		 * Se realiza la logica programada al menos una vez, 
		 * se cumpla o no la condición
		 */
		
		/*do {
			System.out.println("hola al menos una vez");
		}while(x>0);
		*/
		/*do {
			System.out.println("hola al menos una vez");
			System.out.println("valor de x = " + x);
			x++;
		}while(x<10);
		*/
		
		
		/*del string actual, analizar cuales son vocales y cuales son consonantes
		 *  "Hoy es 15 de diciembre de 2021
		 */
		
		String vocales = " ";
		String consonantes = " ";
		int contadorvocales = 0;
		int contadorconsonantes = 0;
		/*
		for(int i=0; i<cadena.length(); i++) {
			//System.out.println(i);
			//System.out.println(cadena.substring(i));
			if((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'A') || 
					(cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'E') || 
					(cadena.charAt(i) == 'i') || (cadena.charAt(i) == 'I') ||
					(cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'O') ||
					(cadena.charAt(i) == 'u') || (cadena.charAt(i) == 'U') ) {
				contadorvocal++;
				//System.out.println(contadorvocal);
				
			}else {
				contadorconsonante++;
				
			}
		}*/
		
		for(int i=0; i<cadena.length(); i++) {
			//System.out.println(cadena.charAt(i));
			if(Character.toString(cadena.charAt(i)).equals("a") || 
			   Character.toString(cadena.charAt(i)).equals("A") ||
			   Character.toString(cadena.charAt(i)).equals("e") ||
			   Character.toString(cadena.charAt(i)).equals("E") ||
			   Character.toString(cadena.charAt(i)).equals("i") ||
			   Character.toString(cadena.charAt(i)).equals("I") ||
			   Character.toString(cadena.charAt(i)).equals("o") ||
			   Character.toString(cadena.charAt(i)).equals("O") ||
			   Character.toString(cadena.charAt(i)).equals("u") ||
			   Character.toString(cadena.charAt(i)).equals("U")	) 
			{
				vocales=vocales+Character.toString(cadena.charAt(i));
				contadorvocales++;
				
			}else {
				try {
					Integer.parseInt(Character.toString(cadena.charAt(i)));
				}catch(Exception ex) {
					consonantes=consonantes+Character.toString(cadena.charAt(i));
					contadorconsonantes++;
				}
			}
		}
		System.out.println("El numero de vocales son: " + contadorvocales+ " y estas son: ");
		System.out.println(vocales);
		System.out.println("El numero de consonantes son: " + contadorconsonantes + " y estas son: ");
		System.out.println(consonantes);
	}
}
