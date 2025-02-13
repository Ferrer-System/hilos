package com.API.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.API.Stream.models.Usuario;

public class StreamListaToStream {

	public static void main(String[] args) {

		List<Usuario> lista = new ArrayList<Usuario>();
		lista.add(new Usuario("Andres", "Lara"));
		lista.add(new Usuario("Ferrer", "Mora"));
		lista.add(new Usuario("Gerardo", "Torres"));
		lista.add(new Usuario("Alan", "Matias"));
		lista.add(new Usuario("Tomas", "Roma"));
		lista.add(new Usuario("Maria", "Jacinto"));
		lista.add(new Usuario("Martin", "Ortiz"));
		lista.add(new Usuario("Marco", "Garcia"));
		
		Stream<String> nombres = lista.stream()
				.map(u -> u.getNombre().toUpperCase()
				.concat(" ")
				.concat(u.getApellido().toUpperCase()))
				.flatMap(nombre ->{
			if (nombre.contains("alan".toUpperCase())) {
				return Stream.of(nombre);
				
			}
			return Stream.empty();
		})
				.map(String::toLowerCase)
				.peek(System.out::println);
	System.out.println(nombres.count());	
		
	}

}




