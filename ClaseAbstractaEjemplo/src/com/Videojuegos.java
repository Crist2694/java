package com;

public abstract class Videojuegos {
	
	String consola;
	String juegos;
	
	public Videojuegos() {
		
	}

	public Videojuegos(String consola, String juegos) {
		
		this.consola = consola;
		this.juegos = juegos;
	}

	public String getConsola() {
		return consola;
	}

	public void setConsola(String consola) {
		this.consola = consola;
	}

	public String getJuegos() {
		return juegos;
	}

	public void setJuegos(String juegos) {
		this.juegos = juegos;
	}

	@Override
	public String toString() {
		return "Videojuegos [consola=" + consola + ", juegos=" + juegos + ", getConsola()=" + getConsola()
				+ ", getJuegos()=" + getJuegos() + "]";
	}
	public abstract  void jugar();
	
}
