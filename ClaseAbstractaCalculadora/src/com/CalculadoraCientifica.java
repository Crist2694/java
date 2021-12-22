package com;

public class CalculadoraCientifica extends Calculadora implements OperacionesBasicas, OperacionesComplejas{

	static final String ALGUNA_CONSTANTE = "MENSAJE";
	public CalculadoraCientifica() {
		
	}
	@Override
	public int sumar(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int restar(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int dividir(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	@Override
	public double elevarExponente(int base, int exponente) {
		// TODO Auto-generated method stub
		return Math.pow(base, exponente);
	}
	@Override
	public double raizCuadrada(int a) {
		// TODO Auto-generated method stub
		return Math.sqrt(a);
	}
	@Override
	public double calculaSeno(int a) {
		// TODO Auto-generated method stub
		return Math.sin(a);
	}
	@Override
	public double CalculaTangente(int a) {
		// TODO Auto-generated method stub
		return Math.tan(a);
	}
	
}
