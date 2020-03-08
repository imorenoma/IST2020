package es.urjc.ist.magiclibrary;

import java.util.*;

public class Bibliotecario extends Identidad{

	ArrayList<Catalogo> prestamo= new ArrayList<>(); 
	
	public Bibliotecario(String nombre, String apellidos, String id, String mobileNum,
						int edad) {
		super(nombre, apellidos, id, mobileNum, edad);
	}
	
	
	
	/*Equals Hashcode  & toString METHODS*/

	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Bibliotecario) && ((Bibliotecario)obj).getNombre()== this.nombre) {
			return true;
		}else if((obj instanceof Bibliotecario) && ((Bibliotecario)obj).getApellidos()== this.apellidos){
			return true;
		}else if((obj instanceof Bibliotecario) && ((Bibliotecario)obj).getEdad()== this.edad){
			return true;
		}else if((obj instanceof Bibliotecario) && ((Bibliotecario)obj).getId()== this.id){
			return true;
		}else if((obj instanceof Bibliotecario) && ((Bibliotecario)obj).getMobileNum()== this.mobileNum){
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, apellidos, edad, id, mobileNum);
	}

	/*ToString Method*/
	@Override
	public String toString() {
		return nombre + " " + apellidos + " " + edad + " " +id + " " + mobileNum;
	}
	
	
	
	
}
