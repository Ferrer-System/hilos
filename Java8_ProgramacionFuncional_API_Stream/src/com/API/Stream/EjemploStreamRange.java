package com.API.Stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;


public class EjemploStreamRange {

	public static void main(String[] args) {
		
	IntStream num = IntStream.range(5, 20).peek(System.out::println);
	
	//int resultado = num.reduce(0, Integer::sum);
	// int resultado = num.sum();
	IntSummaryStatistics statistics = num.summaryStatistics();
	//System.out.println("Resultado = " + resultado);
	
	System.out.println("maximo: " + statistics.getMax());
	System.out.println("minimo: " + statistics.getMin());
	System.out.println("suma: " + statistics.getSum());
	System.out.println("promedio: " + statistics.getAverage());
	System.out.println("total: " + statistics.getCount());

	
	
				
			
	
	}
}
