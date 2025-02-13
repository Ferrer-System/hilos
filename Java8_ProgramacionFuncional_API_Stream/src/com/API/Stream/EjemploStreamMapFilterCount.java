package com.API.Stream;


import java.util.stream.Stream;

import com.API.Stream.models.Usuario;

public class EjemploStreamMapFilterCount {

	public static void main(String[] args) {
		
	long count = Stream
			.of("Pato Guzman","Paco Gonzalez", "Pepa Gutierrez", "Pepe Lara", "Pepe Garcia")
			.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
			.peek(System.out::println)
			.count();
				
			
			System.out.println(count);
	
			
	}
}
