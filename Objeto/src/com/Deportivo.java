package com;

//herencia
public class Deportivo extends AutoGasolina{
	
	//La herencia es un principio por el cual se concreta y especializa
	// la sintesis de una clase en otra,  habilitando el acceso y absorcion 
	// de los miembros de una clase hacia otra. 
	
	private double torque;
	private double hp;
	
	public Deportivo() {
		
	}

	public Deportivo(double torque, double hp) {
		
		this.torque = torque;
		this.hp = hp;
	}

	public double getTorque() {
		return torque;
	}

	public void setTorque(double torque) {
		this.torque = torque;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Deportivo [torque=" + torque + ", hp=" + hp + ", llantas=" + llantas + ", motor=" + motor + ", largo="
				+ largo + ", ancho=" + ancho + ", numasientos=" + numasientos + ", marca=" + marca + ", color=" + color
				+ ", estandar=" + estandar + "]";
	}
	
	

	
	
	
	

}
