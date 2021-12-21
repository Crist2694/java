package com;

public class Principal {
	/* Atributos (Estado)
	 *  
	 *  Metodo constructor
	 *  
	 *  Getter && Setter
	 *  
	 *  toString
	 *  
	 *  
	 *  comportamiento
	 */
	
	
	public static void main(String[] args) {
		
		//instanciar un objeto se tiene que llamar a la clase
		Computadora c1 = new Computadora();
		
		
		c1.setMaterial("Aluminio");
		c1.setMarca("DELL");
		c1.setModelo("XPS");
		c1.setProcesador("intel i5");
		c1.setPuertos(5);
		c1.setTamaño("15.6");
		
		c1.setRam(6.5);
		
		
		System.out.println(c1);
		
		Computadora c2 = new Computadora("Apple", "Mac Air", "M2", 8.0, "Aluminio", "13.2", 1);
		System.out.println(c2);
		
		System.out.println("Determinar cifras " + c2.determinarCifras(1284));
		System.out.println("Determinar cifras " + c2.deteminarCifras("1284"));
		
		//c2.material = "plastico";
		System.out.println(c2);
		
		//c2.material = "ajsjask";
		
		//---
		AutoGasolina ag = new AutoGasolina();
		ag.setNumasientos(4);
		System.out.println(ag);
		
		Deportivo dp = new Deportivo();
		dp.setColor("negro");
		System.out.println(dp);
		
	
	}
}
