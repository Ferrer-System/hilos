package com.API.Stream;

import java.util.stream.Stream;


public class EjemploStreamFiltereeEmpty {

	public static void main(String[] args) {
		
	long count = Stream
			.of("Pato Guzman","Paco Gonzalez", "", "Pepe Lara", "")
			.filter(String::isEmpty)
			.peek(System.out::println)
			.count();
				
	System.out.println("Count = " + count);
			
	}
}
