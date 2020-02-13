package org.urjc.ist;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * En este ejercicio practicamos algunas funciones de E/S
	 */
	
	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Introduce tu nombre: ");
			String nombre = entrada.nextLine();
			
			System.out.print("Introduce tu edad: ");
			int edad = entrada.nextInt();
			
			System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
		}catch(InputMismatchException e) {
			System.out.println("Usage Error: Bad Input parameter, try again");
		}
		// Pregunta: ¿Qué ocurre si introducimos un tipo de dato incorrecto, como
		// una cadena de caracteres no numérica, en la segunda entrada de datos?
		// que solicita el programa?
		
		/*Como Era previsible salta un error:
		 * Exception in thread "main" java.util.InputMismatchException
		 * 	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
		 *  at java.base/java.util.Scanner.next(Scanner.java:1594)
		 *  at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
		 *  at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
		 *  at org.urjc.ist.Ejercicio3.main(Ejercicio3.java:16)
		 *  
		 *  Para Solucionar este problema el programa nos da una pista 
		 *  en este caso existe un missmachException con lo que nos 
		 *  sugierre el manejo de excepciones*/
	}
}
