package com;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				CelularOxxo co = new CelularOxxo();
				
				System.out.println("-->" + co.camara("foto"));
				System.out.println("-->" + co.llamadas("llamadas"));
				System.out.println("-->" + co.mensajes("mensajes"));
				System.out.println("-->" + co.radio("radio"));
				
				System.out.println("---------------> Smarthphone");
				
				CelularSmarthphone cs = new CelularSmarthphone();
				System.out.println("cs--> " + cs.camara("foto"));
				System.out.println("cs--> " + cs.llamadas("llamadas"));
				System.out.println("cs--> " + cs.mensajes("mensajes"));
				System.out.println("cs--> " + cs.radio("radio"));
				
				System.out.println("cs--> "  + cs.juegos("juegos"));
				System.out.println("cs-->" + cs.siri("siri"));
				System.out.println("cs-->" + cs.mensaje("Saludo"));
			
	}
}
