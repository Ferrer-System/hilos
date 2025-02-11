package com.java8.funcional.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {

		public static void main(String[] args) {
			
			Function<String, String> funcion1 = param -> "Hola que tal! " + param;
			String resultado = funcion1.apply("Andres");
			System.out.println(resultado);
			
			//Function<String, String> function2 = param -> param.toUpperCase();
			Function<String, String> function2 = String::toUpperCase;
			System.out.println(function2.apply("Andres"));
			
			BiFunction<String, String, String> function3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
			String resultado2 = function3.apply("Andres", " Jose");
			System.out.println(resultado2);
			
			//BiFunction<String, String, Integer> function4 = (a, b) -> a.compareTo(b);
			BiFunction<String, String, Integer> function4 = String::compareTo;
			System.out.println(function4.apply("andres", "Andres"));
			
			BiFunction<String, String, String> function5 = String::concat;
			System.out.println(function5.apply("Andres", " Jose"));
			
		}
	
}
