package es.urjc.ist.magiclibrary;

import java.util.*;

public class Libros {
	
	/*Vars*/	
	private String titulo;
	private String autor;
	GregorianCalendar fechaPub;
	private String editorial;
	String[] keywords;
	private int numPags;
	private String ISBN;
	
	/*Getter Setter Methods*/
	public String getTitulo() {
		return titulo;
	}
	
	public String setTitulo(String titulo) {
		if(titulo.equals(" ") || titulo.equals("")) {
			this.titulo = "No title Available";
			return this.titulo;
		}else {
			this.titulo = titulo;
			return this.titulo;
		}
		
	}
	
	public String getAutor() {
		
		return this.autor;
	}
	
	public String setAutor(String autor) {
		if(autor.equals(" ") ||autor.equals("") ||(autor.length()>=50)) {
			this.autor ="Unknown Autor";
			return this.autor;
		}else {
			this.autor = autor;
			return this.autor;
		}
	}
		
	public String getEditorial() {
			
		return this.editorial;
	}
		
	public String setEditorial(String editorial) {
		if(editorial.equals(" ")) {
			this.editorial ="Void Editorial";
			return this.editorial;
		}else {
			this.editorial = editorial;
			return this.editorial;
		}
	}
	
	public int getNumPags() {
		return this.numPags;
	}
	
	public int setNumPags(int numPags) {
		if(numPags <= 0) {
			return numPags = 0; 
		}else {
			this.numPags = numPags;
			return this.numPags;
		}		
	}
	
	public String getISBN() {
		return this.ISBN;
	}
	
	public String setISBN(String ISBN) {
		if(ISBN.length() != 13) {
			this.ISBN = "String lenght ISBN = 13";
			return this.ISBN; 
		}else {
			this.ISBN = ISBN;
			return this.ISBN;
		}
	}
	
	/*Equal and Hascode Methods*/
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Libros) && ((Libros)obj).getTitulo()== this.titulo) {
			return true;
		}else if((obj instanceof Libros) && ((Libros)obj).getAutor()== this.autor){
			return true;			
		}else if((obj instanceof Libros) && ((Libros)obj).getEditorial()== this.editorial){
			return true;			
		}else if((obj instanceof Libros) && ((Libros)obj).getNumPags()== this.numPags){
			return true;		
		}else if((obj instanceof Libros) && ((Libros)obj).getISBN()== this.ISBN){
			return true;				
		}else {
			return false;
		}	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(titulo, autor, editorial, numPags, ISBN);
	}
}
