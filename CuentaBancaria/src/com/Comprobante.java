package com;

public class Comprobante {
	
	double saldoActual;
	double monto;
	String fecha;
	String folioCuenta;
	public Comprobante() {
		super();
	}
	public Comprobante(double saldoActual, double monto, String fecha, String folioCuenta) {
		super();
		this.saldoActual = saldoActual;
		this.monto = monto;
		this.fecha = fecha;
		this.folioCuenta = folioCuenta;
	}
	public double getSaldoActual() {
		return saldoActual;
	}
	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}
	public double getMontoRetirado() {
		return monto;
	}
	public void setMontoRetirado(double montoRetirado) {
		this.monto = montoRetirado;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getFolioCuenta() {
		return folioCuenta;
	}
	public void setFolioCuenta(String folioCuenta) {
		this.folioCuenta = folioCuenta;
	}
	@Override
	public String toString() {
		return "Comprobante [saldoActual=" + saldoActual + ", monto=" + monto + ", fecha=" + fecha
				+ ", folioCuenta=" + folioCuenta + ", getSaldoActual()=" + getSaldoActual() + ", getMontoRetirado()="
				+ getMontoRetirado() + ", getFecha()=" + getFecha() + ", getFolioCuenta()=" + getFolioCuenta() + "]";
	}
	
	
	
	
}
