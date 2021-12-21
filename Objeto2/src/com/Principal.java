package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Television t1 = new Television();
		
		t1.setMarca("LG");
		t1.setSistema("WebOS");
		t1.setTamaño(45);
		
		System.out.println(t1);
		
		Television t2 = new Television("Samsung", 55, "Android");
		System.out.println(t2);
		
		Oled o1 = new Oled();
		o1.setColor("gris");
		System.out.println(o1);
		
		Oled o2 = new Oled(true, true, "amarillo");
		System.out.println(o2);
		o2.setLed(false);
		System.out.println("prueba " + o2);
	}
}
