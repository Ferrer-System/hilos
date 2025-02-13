package com.API.Stream;

import java.util.stream.Stream;


public class EjemploStreamReduce {

	public static void main(String[] args) {
		
	Stream<String> nombreStream = Stream
			.of("Pato Guzman","Paco Gonzalez", "Pepa Gutierrez", "Pepe Lara", "Pepe Garcia", "Pepa Gutierrez", "Pepa Gutierrez")
			.distinct();
	
	String resultado = nombreStream.reduce("", (a, b) -> a + ", " + b);
	System.out.println("Resultado = " + resultado);
				
			
	
	}
}
