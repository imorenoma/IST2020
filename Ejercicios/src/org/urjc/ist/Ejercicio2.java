package helloWorld;

import java.util.Random;

public class Ejercicio2 {
	/**
	 * En este ejemplo vamos a trabajar con llamadas a métodos
	 */
	
	public static String longest(String a, String b) {
		// Implementar el cuerpo del método
		return "";
	}

	public static void main(String[] args) {
		
		String cadena1 = "Daenerys Targaryen";
		String cadena2 = "Tyrion Lannister";
		String cadena3 = "John Snow";
		
		// Pregunta 1: Utilizando el método longest, imprime por pantalla
		// la cadena más larga de las tres definidas arriba
		
		System.out.println(longest(longest(cadena1, cadena2), cadena3));
		
		/* 
		 * Pregunta 2: Usando la interfaz de eclipse, explora qué otros
		 * métodos hay disponibles para una variable de tipo String.
	     * Intenta descubrir un método que sirva para separar el nombre de pila
		 * del apellido en las cadenas anteriores. Imprime por pantalla solo 
		 * el nombre de los tres personajes 
		 */
		
		/*
		 * Pregunta 3: El siguiente código muestra cómo usar un objeto de la
		 * clase java.util.Random para generar secuencias de números pseudo-
		 * aleatorios. Partiendo de este código, escribe un bloque de sentencias
		 * que imprima cadena1 si el número obtenido es menor que 0.3, cadena2
		 * si el número obtenido es menor que 0.6 y cadena3 en los restantes casos.
		 */
		
		Random prng = new Random(); // Generador de números pseudo-aleatorios
		System.out.println(prng.nextDouble());
	}
}
