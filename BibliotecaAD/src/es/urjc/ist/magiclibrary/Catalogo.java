package es.urjc.ist.magiclibrary;

import java.util.GregorianCalendar;

public class Catalogo {
	
	
	protected String titulo;
	protected String autor;
	protected String editorial;
	protected int numPaginas;
	protected String ISBN;
	
	public GregorianCalendar fechaPub;
	
	
	String[] keywords;	
	
	
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
	
	public String seteditorial(String editorial) {
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
	
	
	
	public int getNumPaginas(){
		return this.numPaginas;
	}
	
	public int setNumPaginas(int numPaginas) {
		if(numPaginas <= 0 || numPaginas >= 10000) {
			numPaginas = 0;
			this.numPaginas = numPaginas;
			return this.numPaginas;
		}else {
			this.numPaginas = numPaginas;
			return this.numPaginas;
		}
	}	
}	
		