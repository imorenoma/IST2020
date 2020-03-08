package es.urjc.ist.magiclibrary;

import java.util.*;

public class Libros extends Catalogo{
	
	String[] Keywords;
	
	public Libros(String titulo, String autor, String editorial, int numPags, String ISBN) {
		super(titulo, autor, editorial, numPags, ISBN);
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
