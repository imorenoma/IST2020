package es.urjc.ist.magiclibrary.test;

import es.urjc.ist.magiclibrary.*;

public class Test {

	public static void main(String[] args) {
		
		Catalogo libro1 = new Catalogo( "Vivir como un Jinchuriki","Naruto Uzumaki",
										"Random House Mondadori",123,"1234567890111" );
		
		
		System.out.println("Titulo: " + libro1.getTitulo() + " Autor: " + libro1.getAutor());
		System.out.println("Editorial" + libro1.getEditorial() + " NumPags: " + libro1.getNumPags());
		System.out.println("ISBN: " + libro1.getISBN());
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		
		Catalogo pergamino1 = new Catalogo("Jutsu de resurrecion impura",
											"Tobirama Senju", 200);
		
		System.out.println("Titulo: " + pergamino1.getTitulo() + " Autor: " + pergamino1.getAutor());
		System.out.println("NumPags: " + pergamino1.getNumPags());
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		
		Catalogo palimpsesto1 = new Catalogo("La Tabla de Piedra", "Hagoromo Otsutsuki", 1);
		System.out.println("Titulo: " + palimpsesto1.getTitulo() + " Autor: " + palimpsesto1.getAutor());
		System.out.println("NumPags: " + palimpsesto1.getNumPags());
		
	}

}
