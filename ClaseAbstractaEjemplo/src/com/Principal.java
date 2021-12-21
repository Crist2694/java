package com;

public class Principal {
	public static void main(String[] args) {
		
		Sony s = new Sony() {
		};
		s.setConsola("Ps4");
		s.setJuegos("Crash");
		
		s.jugar();
		
		System.out.println("<-------------------------------->");
		Microsoft x = new Microsoft() {
		};
		
		x.setConsola("X");
		x.setJuegos("Halo");
		x.jugar();
	}
}
