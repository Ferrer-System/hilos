package com.java8.funcional.lambda.tarea;

import java.util.Scanner;
import java.util.function.Function;

public class ExpresionLambdaModificarFrase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		String frase = scanner.nextLine();
		scanner.close();
		
		Function<String, String> cambiarFraseFunction = fraseS ->
		fraseS.replaceAll("[,.]", "")
		.replace(" ", "-")
		.toUpperCase();
		
		String resultado = cambiarFraseFunction.apply(frase);
		
		System.out.println("Frase transformada: " + resultado);
		
	}

}
