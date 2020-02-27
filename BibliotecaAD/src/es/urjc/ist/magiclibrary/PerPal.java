package es.urjc.ist.magiclibrary;

import java.util.GregorianCalendar;
import java.util.Objects;

public class PerPal {
	/*Class for pegaminos and pelimpsestos*/
	
	/*Var*/
	
	private String titulo;
	private String autor;
	GregorianCalendar fechaCreacion;
	String[] keyword;
	private int numPags;
	
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
		if(autor.equals(" ") || (autor.length()>=50)) {
			this.autor ="Unknown Autor";
			return this.autor;
		}else {
			this.autor = autor;
			return this.autor;
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
	
/*Equal and Hashcode Methods*/
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Libros) && ((Libros)obj).getTitulo()== this.titulo) {
			return true;
		}else if((obj instanceof Libros) && ((Libros)obj).getAutor()== this.autor){
			return true;			
		}else if((obj instanceof Libros) && ((Libros)obj).getNumPags()== this.numPags){
			return true;		
		}else {
			return false;
		}	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(titulo, autor, numPags);
	}
	
	/*ToString Method*/
	@Override
	public String toString() {		
		return titulo + " " + autor + " " + numPags;
	}
	
}
