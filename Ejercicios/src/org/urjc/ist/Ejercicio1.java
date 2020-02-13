package org.urjc.ist;

import java.lang.Math;

public class Ejercicio1 {
	/**
	 * Primer ejemplo de declaración y uso de variables con tipos primitivos
	 */
	
	public static int suma(int num1, int num2) {
		return num1 + num2;
	}
	
	// Implementar un método suma_double para sumar dos números double que se
	// pasen como argumentos
	
	public static double suma_double(double num1, double num2) {
		return num1 + num2;
	}
	
	public static int resta(int num1, int num2) {
		return num1 + num2;
	}
	
	public static double media(int num1, int num2) {
		//Casting int to double
		double number1 = num1;
		double number2 = num2;
		
		return ((number1 + number2)/2);
	}
	
	public static int max(int num1, int num2){
		
		int maxnum = Math.max(num1,num2);		
		return maxnum;
	}
	
	public static int min(int num1, int num2){
		int minimun=Math.min(num1,num2);
		return minimun;
	}
	
	public static void main(String[] args){
		int a = 1, b = 2, c = 3;
		float d = 3.f, e = 4.f;
		double x = 3.14, y = 2.71, z = 1.1412;
		
		System.out.println("La suma de los tres enteros es:" + suma(a + b, c));
		System.out.println("---------------------------------------");
		System.out.println("La suma doble es: " + suma_double(a, b));
		System.out.println("---------------------------------------");
		System.out.println("La resta es: " + resta(c, b));
		System.out.println("---------------------------------------");
		System.out.println("La media es: " + media(b,c));
		System.out.println("---------------------------------------");
		System.out.println("El numero mas grande es: " + max(b+c,c+c));
		System.out.println("---------------------------------------");
		System.out.println("El numero mas pequeño es: " + min(b+c,c+c));
		System.out.println("---------------------------------------");
		System.out.println("Los floats son: " + d + " " + e);
		
		// Pregunta 1: ¿Podemos usar el método suma(int, int) con argumentos 
		// de tipo float o double? ¿Cómo?
		
		/*Si podemos usarlo siempre y cuando hagamos casting de float a int y 
		 * de double a int*/
		
		// Pregunta 2: ¿Qué ocurre si usamos el método suma_double(double, double)
		// con dos números int como argumentos? ¿Y si usamos dos números float?
		
		/* Si usamos dos numeros int como argumento java los convierte sin problema 
		 * en double lo mismo ocurre con el float solo que en este caso trunca la solucion*/
		
		// Pregunta 3: Completa los tres métodos que faltan por implementar y comprueba
		// su correcto funcionamiento en este método main.

	}
}
