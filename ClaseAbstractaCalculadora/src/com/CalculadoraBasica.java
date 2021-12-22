package com;

public class CalculadoraBasica extends Calculadora implements OperacionesBasicas{
	
	public CalculadoraBasica() {
		
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

//	@Override
//	public double sumar(int a, double b) {
//		// TODO Auto-generated method stub
//		return a+b;
//	}
//
//	@Override
//	public double restar(double a, int b) {
//		// TODO Auto-generated method stub
//		return a-b;
//	}
//
//	@Override
//	public double multiplicar(double a, double b) {
//		// TODO Auto-generated method stub
//		return a*b;
//	}
//
//	@Override
//	public double dividir(int a, int b) {
//		// TODO Auto-generated method stub
//		return a/b;
//	}

}
