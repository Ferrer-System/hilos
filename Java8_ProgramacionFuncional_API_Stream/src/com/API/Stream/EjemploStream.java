package com.API.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {

	public static void main(String[] args) {
		//primera forma 
	/*Stream<String> nombres = Stream.of("Pato","Paco", "Pepa", "Pepe");
	nombres.forEach(System.out::println);*/
		
	//segund FORMA
	/*String[] arr = {"Pato","Paco", "Pepa", "Pepe"};
	Stream<String> nombres = Arrays.stream(arr);
	nombres.forEach(System.out::println);*/
		
	//TERCERA FORMA
	/*Stream<String> nombres = Stream.<String>builder()
			.add("Pato")
			.add("Paco")
			.add("Pepa")
			.add("Pepe")
			.build();
	nombres.forEach(System.out::println);*/
		
		//cuarta forma
	
	List<String> lista = new ArrayList<String>();
	lista.add("Paco");
	lista.add("Pato");
	lista.add("Pepe");
	lista.add("Pepa");
	
	//Stream<String> nombres = lista.stream();
	//nombres.forEach(System.out::println);
	
	lista.stream().forEach(System.out::println);
	}
}
