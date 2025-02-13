package com.API.Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.API.Stream.models.Factura;
import com.API.Stream.models.Usuario;

public class StreamFlatMapFactura {

	public static void main(String[] args) {

		Usuario u1 = new Usuario("Carla", "Gonzales");
		Usuario u2 = new Usuario("Lorena", "Montiel"); 
		
		u1.addFactura(new Factura("compras tecnologia"));
		u1.addFactura(new Factura("compra muebles"));
		
		u2.addFactura(new Factura("compras bicicletas"));
		u2.addFactura(new Factura("compra videojuegos"));
		
		List<Usuario> usuarios = Arrays.asList(u1, u2);	
		
		usuarios.stream().flatMap(u -> u.getFactura().stream())
		.forEach(f -> System.out.println(f.getDescripcion().concat(": cliente -> ")
				.concat(f.getUsuario().toString()))); 
		/*
		for(Usuario u: usuarios) {
			for(Factura f: u.getFactura()) {
				System.out.println(f.getDescripcion());
			}
		}*/
		
		
	}

}
