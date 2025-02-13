package com.API.Stream;

import java.util.Optional;
import java.util.stream.Stream;

import com.API.Stream.models.Usuario;

public class EjemploStreamMapFilterSingle {

	public static void main(String[] args) {
		
	Stream<Usuario> nombres = Stream
			.of("Pato Guzman","Paco Gonzalez", "Pepa Gutierrez", "Pepe Lara", "Pepe Garcia")
			.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
			.filter(u -> u.getNombre().equals("Pepe"))
			.peek(System.out::println);
				
			Optional<Usuario> usuario = nombres.findFirst();
			// System.out.println(usuario.orElse(new Usuario("Marcus", "Meredic")).getNombre());
			// System.out.println(usuario.orElseGet(() -> new Usuario("Marcus", "Meredic")).getNombre());
			if (usuario.isPresent()) {
				System.out.println(usuario.get());
			}else {
				System.out.println("No se encontro el objeto");
			}
			
	//nombres.forEach(System.out::println);
	
	}
}
