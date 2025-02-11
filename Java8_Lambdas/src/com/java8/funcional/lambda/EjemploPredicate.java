package com.java8.funcional.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.java8.funcional.lambda.models.Usuario;

public class EjemploPredicate {

	public static void main(String[] args) {

		Predicate<Integer> testPredicate = number -> number >10;
		boolean resultado = testPredicate.test(11);
		System.out.println("Rsultado = " + resultado);
		
		Predicate<String> test2 = rol -> rol.equals("ROLE_ADMIN");
		System.out.println(test2.test("ROLE_ADMIN"));
		
		BiPredicate<String, String> test3 = (a, b) -> a.equals(b);
		System.out.println(test3.test("andres", "andres"));
		
		BiPredicate<Integer, Integer> test4 = (i, j) -> j>i;
		boolean resultado2 = test4.test(5, 10);
		System.out.println(resultado2);
		
		Usuario a = new Usuario();
		Usuario b = new Usuario();
		
		a.setNombre("maria");
		b.setNombre("cata");
		BiPredicate<Usuario, Usuario> test5 = (usuarioA, usuarioB) -> usuarioA.getNombre().equals(usuarioB.getNombre());
		System.out.println(test5.test(a, b));
	}

}
