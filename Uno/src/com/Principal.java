package com;

public class Principal {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Logica --->
		//TIpos de datos
		//estructuras de control
		//ciclicas
		// arrays de 1 y 2 dimensiones
		// Java RW (lectura / escritura de archivos)
		
		//Datos primitivos
		// -2 a la 31 a 2 a la 31-1
		
		/*
		int x =10;
		//byte -128 a 127
		byte b = 127;
		//short -32768 a 32767
		short s = 32767;
		// -2 a la 33 a 2 a la 33-1
		long l; 
		//Toda variable que inicializemos a partir de una clase, se tiene que invocar
		//primero a la clase (primer letra mayuscula)
		String m = "algo";
		
		
		//Object es ka ckase nadre de TODAS las clases de Java
		Object o = m;
		
		//Datos Wrapper
		Integer j = 230;
		j.byteValue();
		j.doubleValue();
		
		Double dd = 340.55;
		dd.doubleValue();
		dd.compareTo(dd);
		
		Byte by = 100;
		by.equals(dd);
		by.floatValue();
		
		Boolean bo = false;  
		bo.compareTo(null);
		bo.hashCode();
		bo.parseBoolean("false");
		
		
		//En Java, los numeros decimales se reconoces como double por default 
		// se tiene que agregar la 'F' para indicar que son Float
		Float fl = 513321f;
		fl.floatValue();
		

		//En Java, los numeros decimales se reconoces como double por default 
		// se tiene que agregar la 'L' para indicar que son Long 
		Long lo = 45552l;
		lo.shortValue();
		
		
		Short sho = 2;
		sho.equals(j);
		
		*/
		// ------------------------------------------------------------------------------//
		//IF
		// Evalua el cumplimiento de una condición 
		// Verdadero * Falso
		//Operadores logicos, and && y or ||
		short s = -32767;
		
		if(s>50000 || s<0 ) {
			System.out.println("si");
		}
		else {
			System.out.println("no");
		}
		
		//---------------------------------------------------------------------------//
		//SWITCH
		//Evalua multiples casos 
		int x =3;
		
		
		if(x==3) {
			System.out.println("es tres");
		}else if(x==5) {
			System.out.println("es cinco");
		}
		else if(x==10) {
			System.out.println("es diez");
		}else
		{
			System.out.println("?");
		}
		switch(x) {
			case 3: 
				System.out.println("es tres");
				break;
			case 5: 
				System.out.println("es cinco");
				break;
			case 10: 
				System.out.println("es diez");
				break;
			default: 
				System.out.println("?");
		}
		
	}
	
	
}
