package com.API.Stream.Tareas;

import java.util.stream.IntStream;

public class ArregloDeCienElementos {

	public static void main(String[] args) {

		double resultado = IntStream.rangeClosed(1, 100)
				.filter(n -> n% 10 !=0)
				.mapToDouble(n -> n/2.0)
				.reduce(0.0, Double::sum);
		
		System.out.println("Resultado: " + resultado);
		
	}

}
