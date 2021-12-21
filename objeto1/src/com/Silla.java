package com;

public class Silla {

	public int patas;
	public String respaldo;
	public String asiento;
	public String cojin;
	
	//constructor vacio
	public Silla() {
		
	}

	public Silla(int patas, String respaldo, String asiento, String cojin) {
		super();
		this.patas = patas;
		this.respaldo = respaldo;
		this.asiento = asiento;
		this.cojin = cojin;
	}
	
	public void setPatas(int p) {
		this.patas = p;
	}
	
	public int getPatas() {
		return patas; 
	}

	public String getRespaldo() {
		return respaldo;
	}

	public void setRespaldo(String respaldo) {
		this.respaldo = respaldo;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	public String getCojin() {
		return cojin;
	}

	public void setCojin(String cojin) {
		this.cojin = cojin;
	}

	//toString
	
	@Override
	public String toString() {
		return "Silla [patas=" + patas + ", respaldo=" + respaldo + ", asiento=" + asiento + ", cojin=" + cojin + "]";
	}
	
	//COMPORTAMIENTO
	public void sentarse() {
		System.out.println("Toma asiento");
	}
	
	
	
	
}
