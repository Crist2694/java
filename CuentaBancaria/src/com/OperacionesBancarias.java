package com;

public interface OperacionesBancarias {
	
	Object retirar(double monto);
	Object depositar(double monto);
	Object transferir(double monto, CuentaBancaria cuenta);
	
	
	
	
	
}
