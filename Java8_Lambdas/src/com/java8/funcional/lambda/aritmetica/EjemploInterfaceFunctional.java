package com.java8.funcional.lambda.aritmetica;

public class EjemploInterfaceFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aritmetica sumAritmetica = (a, b) -> a + b;
		Aritmetica restAritmetica = (a,b) -> a - b;
		
		Calculadora cal = new Calculadora();
		
		System.out.println(cal.calcular(10, 5, sumAritmetica));
		System.out.println(cal.calcular(10, 5, restAritmetica));
		System.out.println(cal.calcular(10, 5, (a, b) -> a * b));
		
		System.out.println(cal.calcularConBiFunction(10, 5, (a, b) -> a + b));
		
		
	}

}
