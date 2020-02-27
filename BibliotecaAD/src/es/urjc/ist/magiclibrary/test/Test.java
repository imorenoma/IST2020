package es.urjc.ist.magiclibrary.test;

import es.urjc.ist.magiclibrary.*;

public class Test {

	public static void main(String[] args) {
		
		Libros book = new Libros();
		Libros book2 = new Libros();		
		PerPal pergamino1 = new PerPal();
		User usuario1 = new User();
		
		book.setAutor("Naruto Uzumaki");
		book.setTitulo("Vivir como un Jinchuriki");
		book.setEditorial("Random House Mondadori");
		book.setNumPags(123);
		book.setISBN("1234567890111");
		
		System.out.println(book.getAutor() + " / " + book.getTitulo()+ " / " + book.getEditorial());
		System.out.println(book.getNumPags() + " / " + book.getISBN());
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		
		book2.setAutor("Sakura Haruno");
		book2.setTitulo("Tratado Medico Ninja");
		book2.setEditorial("Planeta");
		book2.setNumPags(500);
		book2.setISBN("2134667890222");
		System.out.println(book2.getAutor() + " / " + book2.getTitulo()+ " / " + book2.getEditorial());
		System.out.println(book2.getNumPags() + " / " + book2.getISBN());
		
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		
		pergamino1.setTitulo("Jutsu de resurrecion impura");
		pergamino1.setAutor("Tobirama Senju");
		pergamino1.setNumPags(200);
		
		System.out.println(pergamino1.toString());		

		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		
		usuario1.setNombre("Sasuke");
		usuario1.setApellidos("Uchiha");
		usuario1.setEdad(20);
		usuario1.setId("123456789123");
		usuario1.setMobileNum("123123123");
		
		System.out.println("Usuario" + " " + usuario1.toString());
	}
}