package com.API.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import com.API.Stream.models.Usuario;

public class StreamParallel {

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
		
		long t1 = System.currentTimeMillis();
		
		String resultado = lista.stream()
				.parallel()
				.map(u -> u.toString().toUpperCase())
				.peek(n ->{
					System.out.println("Nombre del Thread: " + 
							Thread.currentThread().getName()+ " - " + n);
				})
				
				.flatMap(nombre ->{
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			if (nombre.contains("alan".toUpperCase())) {
				return Stream.of(nombre);
				
			}
			return Stream.empty();
		})
				.findAny().orElse("");
		long t2 = System.currentTimeMillis();
		System.out.println("Tiempo total: " + (t2 - t1));
	System.out.println(resultado);	
		
	}

}




