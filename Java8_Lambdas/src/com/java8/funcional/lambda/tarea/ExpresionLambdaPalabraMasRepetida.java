package com.java8.funcional.lambda.tarea;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExpresionLambdaPalabraMasRepetida {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		String frase = scanner.nextLine();
		scanner.close();
		
		Function<String, Map<String, Integer>> palabraMasRepetida = fraseS -> {
			
			if (fraseS.isEmpty()) {
				return Collections.singletonMap("No Ingresaste palabra", 0);
			}
			
		String[] palabras = fraseS.toLowerCase().replaceAll("[,.]", "").split("\\s+");
		
		Map<String, Integer> frecuencia = Arrays.stream(palabras)
				.collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));
		
		return frecuencia.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.map(entry -> Collections.singletonMap(entry.getKey(), entry.getValue()))
				.orElse(Collections.singletonMap("No hay palabras", 1));
		
		};
		
		Map<String, Integer> resultado = palabraMasRepetida.apply(frase);
		resultado.forEach((palabra, cantidad) ->
		System.out.println("Palabra mas repetida: " + palabra + "(veces: " + cantidad + ")")
		);
		
	}

}
