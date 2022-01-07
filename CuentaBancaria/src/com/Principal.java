package com;

public class Principal {
	 public static void main(String[] args) {
		
//		 CuentaBancaria cb = new CuentaBancaria();
//		 cb.setFechaapertura("23/12/2021");
//		 cb.setFolio("142015");
//		 cb.setMax(10000);
//		 cb.setMin(2000);
//		 cb.setSaldo(3500);
//		 
//		 System.out.println(cb);
//		 
//		 cb.retirar(5);
//		 cb.depositar(500);
//		 cb.transferir(140, cb);
	
		 CuentaBancaria c1 = new CuentaBancaria();
		 CuentaBancaria c2 = new CuentaBancaria();
		 
		 c1.setFechaapertura("01-11-2021");
		 c1.setFolio("000013");
		 c1.setMax(20000.00);
		 c1.setMin(1500.00);
		 c1.setSaldo(4500);
		 
		 c2.setFechaapertura("23-07-2021");
		 c2.setFolio("0234");
		 c2.setMax(10000);
		 c2.setMin(2000);
		 c2.setSaldo(3800);
		 
//		 c1.retirar(499);
		 System.out.println(c1.retirar(500));
//		 System.out.println(c1);
//
//		 c1.retirar(500);
//		 System.out.println(c1);
		 System.out.println("Deposito");
		 System.out.println(c1.depositar(2000));
		 
		 System.out.println("Transferir");
		 System.out.println(c1.transferir(500, c2));
		 System.out.println("Cuenta 2 " + c2);
	 }
	 
}
