package helloWorld;
import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * En este ejercicio practicamos algunas funciones de E/S
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Introduce tu edad: ");
		int edad = entrada.nextInt();
		
		System.out.println("Me llamo " + nombre + "y tengo " + edad + " años.");
		
		// Pregunta: ¿Qué ocurre si introducimos un tipo de dato incorrecto, como
		// una cadena de caracteres no numérica, en la segunda entrada de datos?
		// que solicita el programa?
	}
}
