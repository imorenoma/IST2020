package es.urjc.ist.magiclibrary;

import java.util.Objects;

public class Pergaminos extends Catalogo{

	public Pergaminos(String titulo, String autor, int numPags) {
		super(titulo, autor, numPags);
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Pergaminos) && ((Pergaminos)obj).getTitulo()== this.titulo) {
			return true;
		}else if((obj instanceof Pergaminos) && ((Pergaminos)obj).getAutor()== this.autor){
			return true;
		}else if((obj instanceof Pergaminos) && ((Pergaminos)obj).getNumPags()== this.numPags){
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo, autor, numPags);
	}
}

