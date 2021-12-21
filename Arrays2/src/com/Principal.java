package com;

import java.util.Scanner;

/* 12
 * 
 * 127	94312657831 --->h   = 14
 * 371	37137137137 ---- =14
 * 
 * sumatoria h = 
 * codigo =es el valor absoluto de la resta de ambas sumatorias
 */


public class Principal {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int i=0, j=0;
		
		int [] a = {1,2,3,4};
		int [] b = {5,6,7,8};
		int c=0;
		int sumatoria=0;
		int [] multiplicacion = new int[5];
		for(c=0; c<5;c++) {
//		System.out.println(a[c]);
//		System.out.println(b[c]);
			multiplicacion[c] += a[c]*b[c];
			System.out.println(multiplicacion[c]);
			sumatoria += a[c]; 
			
		}
		System.out.println("La sumatoria es: " + sumatoria);
		
		
//		int[] Array1  = new int[14];
//		int[] Array2 = new int[14];
//		for(i=0; i<=13;i++) {
//			
//			System.out.println("Los valores para arreglo 1 en posicion " + i+ ":");
//			Array1[i] = leer.nextInt();
//			
//			for(j=0; j<=13; j++) {
//				System.out.println("Los valores para arreglo 2 en posicion " + j+ ":");
//				Array1[j] = leer.nextInt();
//				System.out.println(Array2[j]);
//			}
//		}for(i=0; i<=13;i++) {
//		System.out.println(Array1[i]);
//			for(j=0;j<=13;j++) {
//				System.out.println(Array2[j]);
//			}
//		}
	}
}
