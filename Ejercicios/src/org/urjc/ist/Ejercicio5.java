package org.urjc.ist;
import java.util.Random;
import java.util.Arrays;

public class Ejercicio5 {
	/*
	 * Enunciado: Crea un programa que genere una serie de números
	 * enteros pseudo-aleatorios, usando java.util.Random. El programa
	 * debe concluir cuando se hayan generado 10 números pares.
	 * 
	 * A continuación, expandir el programa creando un bloque de código
	 * que genere una nueva serie de, exactamente, 20 números enteros pseudo-aleatorios.
	 * Al concluir, el programa debe imprimir por pantalla el menor de todos los
	 * números generados en esta segunda serie.
	 */
	
	public static void fstRandom() {
		
		int[] even = new int[10];
		int i = 0;
		int count = 0;
		
		while(count <= 9) {
			Random num = new Random();
			int number = num.nextInt();
			
			if((number%2)==0) {
				even[i]= number;
				System.out.println(even[i] + " ");
				i++;
				count++;
			}			
		}		
	}
	
	public static void scndRandom() {
		
		int[] maxnum = new int[20];
		int counter2 =0;
		int i = 0;
		int j ;		
		
		while(counter2 <= 19) {
			
			Random numbers = new Random();
			int num = numbers.nextInt();
			
			maxnum[i] = num;
			i++;
			counter2++;
		}
		
		Arrays.sort(maxnum);
		System.out.println(maxnum[0]);
		
		
	}
	public static void main(String[]args) {
		
		fstRandom();
		System.out.println("-------------------");
		scndRandom();
	}
	
}
