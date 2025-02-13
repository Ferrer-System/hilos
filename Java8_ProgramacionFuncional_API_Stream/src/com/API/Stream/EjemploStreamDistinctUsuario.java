package com.API.Stream;

import java.util.stream.Stream;

import com.API.Stream.models.Usuario;

public class EjemploStreamDistinctUsuario {

	public static void main(String[] args) {
		
	Stream<Usuario> nombres = Stream
			.of("Pato Guzman","Paco Gonzalez", "Pepa Gutierrez", "Pepe Lara", "Pepe Garcia", "Pato Guzman", "Pato Guzman")
			.distinct()
			.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]));
			
			
	nombres.forEach(System.out::println);
	
	}
}
