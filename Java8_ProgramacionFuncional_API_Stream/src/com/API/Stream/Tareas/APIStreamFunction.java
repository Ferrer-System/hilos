package com.API.Stream.Tareas;

import java.util.function.Function;
import java.util.stream.IntStream;

public class APIStreamFunction {

	public static void main(String[] args) {

		int[] numeros = {12, 45, 67, 89, 21, 10, 1054, 85, 96, 65};
		
		Function<int[], Integer> valorMax = arr -> 
		IntStream.of(arr).reduce(Integer.MIN_VALUE, Integer::max);
		
		int maximo = valorMax.apply(numeros);
		
		
		System.out.println("El numero mayor es: " + maximo);
	}

}
