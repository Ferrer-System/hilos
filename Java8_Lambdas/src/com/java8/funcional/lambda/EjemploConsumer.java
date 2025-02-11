package com.java8.funcional.lambda;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.java8.funcional.lambda.models.Usuario;

public class EjemploConsumer {

	public static void main(String[] args) {
		
		Consumer<Date> consumer = fecha -> {
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			
			System.out.println(f.format(fecha));
		};
		
		consumer.accept(new Date());

		BiConsumer<String, Integer> consumidorBi = (nombre, edad) ->{
			System.out.println(nombre + ", tiene " + edad + " años!");
			
		};
		consumidorBi.accept("Pepe", 20);
		Consumer<String> consumer2 = System.out::println;
		consumer2.accept("Hola mundo lambda");
		
		List<String> nombres = Arrays.asList("Andres", "Pepe", "Luz", "Paco");
		nombres.forEach(consumer2);
		
		Supplier<Usuario> crearUsuario = ( ) -> new Usuario();
		//Usuario usuario = new Usuario();
		Usuario usuario = crearUsuario.get();
		/*BiConsumer<Usuario, String> asignarNombre = (persona, nombre) ->{
			persona.setNombre(nombre);
		};*/
		//segunda opcion
		BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
		asignarNombre.accept(usuario, "Andres");
		System.out.println("Nombre del usuario: " + usuario.getNombre());
		
		Supplier<String> proveedor = () ->{
			return "Hola mundo lambda supplier";
		};
		
		System.out.println(proveedor.get());
		
	}

}
