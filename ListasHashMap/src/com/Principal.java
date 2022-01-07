package com;

import java.util.ArrayList;
import java.util.*;

public class Principal {
	public static void main(String[] args) {
		//Instanciamos nueva lista
		List<Integer> l = new ArrayList <Integer>();
		List<String> ls = new ArrayList <String>();
		
		//añadirle una lista de enteros
		l.add(8);
		l.add(29);
		l.add(13);
		l.add(27);
		l.add(58);
		
		
		// añadir valores a la lista string
		ls.add("uno");
		ls.add("dos");
		ls.add("tres");
		ls.add("cuatro");
		ls.add("cinco");
		ls.add("seis");
		ls.add("siete");
		
		System.out.println(ls);
		System.out.println(l);
		//calcula el tamaño de una lista
		System.out.println("enteros " + l.size());
		System.out.println("Strings  " + ls.size());
		
		//eliminar un elemento usando el indice
		ls.remove(3);
		System.out.println(ls);
		
		//eliminar un elemento pasandole una copia del elemento a eliminar
		ls.remove("siete");
		System.out.println(ls);
	
		//obtener elemento de una lista
		int n=l.get(4);
		System.out.println(n);
		
		String s = ls.get(2);
		System.out.println(s);
		
		
		//************************ HashMap
		
		/*
		 * Inicializar un hasmap
		 */
		
		HashMap<String, String> hs = new HashMap<String, String>();
		
		//agregar valor al hasmap
		
		hs.put("Mario", "2458788749");
		hs.put("Miguel", "6449749847");
		hs.put("Mariana", "2224400056");
		
		System.out.println(hs);
		//despues de actualizar
		//sobreescribir los valores asociados a las llaves
		hs.put("Mariana", "2221142056");	

		System.out.println(hs);
		
		//eliminar
		hs.remove("Miguel");
		hs.remove("Mario");
		System.out.println(hs);
		
		
		//crear una lista de cualquier tipo de objeto
		
		List<Object> lo = new ArrayList<Object>();
		lo.add(12);
		lo.add(true);
		lo.add(12.987);
		lo.add(new Date());
		lo.add(ls);
		lo.add(l);
		lo.add(hs);
		
		System.out.println(lo);
		
	}
	
}
