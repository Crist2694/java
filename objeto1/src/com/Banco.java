package com;

public class Banco extends Silla{
	//herencia de silla
	
	
	private String acabados;
	private String base;
	
	
	
	public Banco() {
		
	}



	public Banco(String acabados, String base) {
		
		this.acabados = acabados;
		this.base = base;
	}



	public Banco(int patas, String respaldo, String asiento, String cojin, String acabados, String base) {
		super(patas, respaldo, asiento, cojin);
		this.acabados = acabados;
		this.base = base;
	}



	public String getAcabados() {
		return acabados;
	}



	public void setAcabados(String acabados) {
		this.acabados = acabados;
	}



	public String getBase() {
		return base;
	}



	public void setBase(String base) {
		this.base = base;
	}



	@Override
	public String toString() {
		return "Banco [acabados=" + acabados + ", base=" + base + ", patas=" + patas + ", respaldo=" + respaldo
				+ ", asiento=" + asiento + ", cojin=" + cojin + "]";
	}
	
	
	

}
