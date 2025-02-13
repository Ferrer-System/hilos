package com.API.Stream;


import java.util.stream.Stream;

import com.API.Stream.models.Usuario;

public class EjemploStreamMapFilterSingle2 {

	public static void main(String[] args) {
		
	Usuario usuario = Stream
			.of("Pato Guzman","Paco Gonzalez", "Pepa Gutierrez", "Pepe Lara", "Pepe Garcia")
			.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
			.peek(System.out::println)
			.filter(u -> u.getId().equals(8))
			.findFirst().orElseGet(() -> new Usuario("Ferrer", "Carracas"));
				
			
			System.out.println(usuario);
	
	}
}
