package org.urjc.ist;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Enunciado: crear un programa que solicite introducir por consola
	 * un número entero en el intervalo [1, 12]. A continuación, el programa
	 * debe imprimir por pantalla el nombre completo del mes que corresponde
	 * al entero introducido.
	 */
	
	public static void main(String[]args) {
		
		String[] calendar = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre","Octubre","Noviembre", "Diciembre"};
				
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a number");		
		int number = input.nextInt();
		int month = number - 1;
		
		if(number <1 || number > 12 ) {
			System.out.println("Usage Error: argv[1] number between 1 & 12");
		}else {
			System.out.println("The Month is: "+ calendar[month]);
		}
	}
}
