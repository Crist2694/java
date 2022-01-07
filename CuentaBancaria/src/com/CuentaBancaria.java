package com;

public class CuentaBancaria implements OperacionesBancarias {
	double saldo;
	double max;
	double min;
	String fechaapertura;
	String folio;
	
	
	public CuentaBancaria() {
		
	}
	public CuentaBancaria(double saldo, double max, double min, String fechaapertura, String folio) {
		super();
		this.saldo = saldo;
		this.max = max;
		this.min = min;
		this.fechaapertura = fechaapertura;
		this.folio = folio;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public String getFechaapertura() {
		return fechaapertura;
	}
	public void setFechaapertura(String fechaapertura) {
		this.fechaapertura = fechaapertura;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", max=" + max + ", min=" + min + ", fechaapertura=" + fechaapertura
				+ ", folio=" + folio + ", getSaldo()=" + getSaldo() + ", getMax()=" + getMax() + ", getMin()="
				+ getMin() + ", getFechaapertura()=" + getFechaapertura() + ", getFolio()=" + getFolio() + "]";
	}
	
	///---comportamiento
	@Override
	public Object retirar(double monto) {
		if((this.saldo - monto)>this.min) {
				this.saldo= saldo-monto;//actualiza el saldo ya se procede con el retiro
			return new Comprobante(saldo, monto, "23-12-2021", this.folio);//retiro
		}else
		{
			System.out.println("El retiro deja sin fondos suficientes a la cuenta");
			return 0;
			
		}
	}
	@Override
	public Object depositar(double monto) {
		// TODO Auto-generated method stub
		//valida que el deposito no exceda el maximo de la cuenta
		if ((this.saldo+monto)>this.max) {
			//this.saldo= saldo+monto;//actualiza el saldo del monto disponible
			System.out.println("El deposito excede el maximo permitido de la cuenta");
			return 0;
		}else if(monto>this.max) {//valida que el monto por si solo no exceda el maximo permitido en la cuenta 
			System.out.println("El deposito excede el maximo permitido en la cuenta");
			return 0;
			
		}else
			this.saldo = this.saldo+monto;
			return new Comprobante(saldo, monto, "23-12-2021", this.folio);
	}
	@Override
	public Object transferir(double monto, CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		//validar que el retiro de la cuenta origen no deje por debajo del minimo
		if (this.saldo-monto<this.min) {
			System.out.println("La transferencia dejaria sin saldo suficiente la cuenta");
			return false;
		}else if (cuenta.getMax()<monto) {
			System.out.println("La transferencia excede el maximo permitido en la cuenta");
			return false;
		}else if (cuenta.getMax()<cuenta.getSaldo()+monto) {
			System.out.println("La transferencia excede el maximo permitido en la cuenta");
			return false;
		}
		else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			return new Comprobante(cuenta.getSaldo(), monto, "23-12-2021", this.folio);
		}
		
	}
	
	
}
