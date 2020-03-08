package es.urjc.ist.magiclibrary;

import java.util.GregorianCalendar;

public class Catalogo {	
	
	protected String titulo;
	protected String autor;
	protected String editorial;
	protected int numPags;
	protected String ISBN;
	
	public GregorianCalendar fechaPub;
	
	public Catalogo(String titulo, String autor, String editorial, int numPags,
					String ISBN) {
		
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setEditorial(editorial);
		this.setNumPags(numPags);
		this.setISBN(ISBN);
	
	}
	
	/*Sobrecargamos el constructor Catalogo*/
	
	public Catalogo(String titulo, String autor, int numPags) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setNumPags(numPags);
	}


	public String getTitulo(){
		return this.titulo;
	}
	
	public String setTitulo(String titulo) {
		if(titulo.equals("") || titulo.equals(" ")) {
			titulo = "titulo is void";
			this.titulo = titulo;
			return this.titulo;
		}else {
			this.titulo= titulo;
			return this.titulo;
		}
	}
	
	
	public String getAutor(){
			return this.autor;
	}
		
	public String setAutor(String autor) {
		if(autor.equals("") || autor.equals(" ")) {
			autor = "autor is void";
			this.autor = autor;
			return this.autor;
		}else if(autor.length() >= 50){
			autor = "autor out of lenght range";
			this.autor = autor;
			return this.autor;
		}else {
			this.autor = autor;
			return this.autor;
		}
				
	}
	
	
	public String getEditorial(){
		return this.editorial;
	}
	
	public String setEditorial(String editorial) {
		if(editorial.equals("") || editorial.equals(" ")) {
			editorial = "editorial is void";
			this.editorial = editorial;
			return this.editorial;
		}else if(editorial.length() >= 50){
			editorial = "editorial out of lenght range";
			this.editorial = editorial;
			return this.editorial;
		}else {
			this.editorial = editorial;
			return this.editorial;
		}
	}
	
	
	
	public int getNumPags(){
		return this.numPags;
	}
	
	public int setNumPags(int numPags) {
		if(numPags <= 0 || numPags >= 10000) {
			numPags = 0;
			this.numPags = numPags;
			return this.numPags;
		}else {
			this.numPags = numPags;
			return this.numPags;
		}
	}
	
	
	public String getISBN() {
		return this.ISBN;
	}
	
	public String setISBN(String ISBN) {
		if(ISBN.equals("") || ISBN.equals(" ")) {
			ISBN = "ISBN is void";
			this.ISBN = ISBN;
			return this.ISBN;
		}else if(ISBN.length() != 13){
			ISBN = "ISBN is void";
			this.ISBN = ISBN;
			return this.ISBN;			
		}else {
			this.ISBN = ISBN;
			return this.ISBN;
		}
	}
}	
		