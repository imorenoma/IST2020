package org.urjc.ist;

public class Pedido extends Pizza {
	
	String Ingredientes[];
	
	public Pedido(String nombre, String tamaño, double precio) {
		super(nombre, tamaño, precio);
		Ingredientes = new String[5];
	}
	

	public static void main(String[] args) {
		
		
	}

}
