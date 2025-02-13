package com.API.Stream;

import java.util.stream.Stream;

import com.API.Stream.models.Usuario;

public class EjemploStreamFilterFlatMap {

	public static void main(String[] args) {
		
	Stream<Usuario> nombres = Stream
			.of("Pato Guzman","Paco Gonzalez", "Pepa Gutierrez", "Pepe Lara", "Pepe Garcia")
			.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
			
			.flatMap(u ->{
				if (u.getNombre().equalsIgnoreCase("Pepe")) {
					return Stream.of(u);
				}
				return Stream.empty();
			})
			.peek(System.out::println);
	System.out.println(nombres.count());
			//nombres.forEach(System.out::println);
	
	}
}
