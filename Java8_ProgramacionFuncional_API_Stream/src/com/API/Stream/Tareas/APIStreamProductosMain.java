package com.API.Stream.Tareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.API.Stream.Tareas.Models.Producto;

public class APIStreamProductosMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Producto> productos = new ArrayList<>();
		
		System.out.println("Ingrtese la cantidad de productos (entre 3 y 5): ");
		
		int n = scanner.nextInt();
		
		while (n < 3 || n > 5) {
			System.out.println("Porfavor ingrese un numero entre 3 y 5: ");
			n = scanner.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Producto " + i + " - Precio: ");
			double precio = scanner.nextDouble();
			
			System.out.println("Producto " + i + " - Cantidad: ");
			int cantidad = scanner.nextInt();
			
			productos.add(new Producto(precio, cantidad));
			
		}
		
		System.out.println("\nLista de productos: ");
		productos.forEach(System.out::println);
		
		double total = productos.stream().mapToDouble(Producto::getImporte).sum();
		System.out.println("\nGran total: " + String.format("%.2f", total));
		scanner.close();
	}

}
