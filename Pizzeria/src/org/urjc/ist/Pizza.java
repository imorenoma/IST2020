package org.urjc.ist;

public class Pizza {
		
		private String nombre;
		private String tamaño;
		private double precio;
		//array de ingredientes
		
		//Here wee create Pizza constructor
		public Pizza(String nombre, String tamaño,double precio ) {		
		
			this.setNombre(nombre);
			this.setTamaño(tamaño);
			this.setPrecio(precio);
		}
		
		//getter and setter methods
		
		public String getNombre() {
			return this.nombre;
		}
		
		public String getTamaño() {
			return this.tamaño;
		}
		
		public double getPrecio() {
			return this.precio;
		}
		
		
		public boolean setNombre(String nombre) {
			if(nombre.length()> 30) {
				System.out.println("Error! Longitud inválidad para nuevo nombre");
				return false;
			}else {
				this.nombre = nombre;
				return true;
			}
		}
		
		public boolean setTamaño(String tamaño) {
			if(tamaño.length()> 30) {
				System.out.println("Error! Tamaño Pizza erroneo");
				return false;
			}else {
				this.tamaño = tamaño;
				return true;
			}
		}
		
		public boolean setPrecio(double precio) {
			if(precio<=5.0 || precio >=50.0 ) {
				System.out.println("Error! Tamaño Pizza erroneo");
				return false;
			}else {
				this.precio = precio;
				return true;
			}
		}
		
		public static void main(String[]args) {
			
			Pizza pizza1 = new Pizza("NewYork","Familiar",15.95);
			
			System.out.println("Su pizza es: " + pizza1.getNombre());
			System.out.println("De tamaño: " + pizza1.getTamaño());
			System.out.println("Y su precio es: " + pizza1.getPrecio());
		}

}
