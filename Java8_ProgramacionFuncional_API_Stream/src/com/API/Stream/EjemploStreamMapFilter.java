package com.API.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.API.Stream.models.Usuario;

public class EjemploStreamMapFilter {

	public static void main(String[] args) {
		
	Stream<Usuario> nombres = Stream
			.of("Pato Guzman","Paco Gonzalez", "Pepa Gutierrez", "Pepe Lara", "Pepe Garcia")
			.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
			.filter(u -> u.getNombre().equals("Pepe"))
			.peek(System.out::println);
				
			List<Usuario> lista = nombres.collect(Collectors.toList());
			lista.forEach(System.out::println);
	//nombres.forEach(System.out::println);
	
	}
}
