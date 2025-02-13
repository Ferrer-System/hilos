package com.API.Stream.Tareas;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArregloBidimensionalAPIStream {

	public static void main(String[] args) {

		String[][] lenguajes = {
				{"Java", "Groovy"},
				{"PHP"},
				{"C#", "Phython", "Grooby"},
				{"java", "javascript", "Kotlin"},
				{"JavaScript"},
				{}
		};
		
		String[] resultado = Stream.of(lenguajes)
				.flatMap(Arrays::stream)
				.map(String::toLowerCase)
				.distinct()
				.toArray(String[]::new);
		
		System.out.println(Arrays.toString(resultado));
		
		
	}

}
