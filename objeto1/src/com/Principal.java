package com;

public class Principal {
	public static void main(String[] args) {
		
		//instanciar un objeto se tiene que llamar la clase
		
		Silla s1 = new Silla();
		
		s1.setPatas(4);
		s1.setCojin("seda");
		s1.setAsiento("seda");
		s1.setRespaldo("Madera");
		
		System.out.println(s1);
		
		Silla s2 = new Silla(5, "Aluminio", "Plastico", null);
				System.out.println(s2);
				
		Banco b1 = new Banco();
		b1.setPatas(3);
		System.out.println(b1);
		
	}
}
