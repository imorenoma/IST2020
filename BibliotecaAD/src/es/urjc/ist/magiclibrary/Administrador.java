package es.urjc.ist.magiclibrary;

import java.util.*;

public class Administrador extends Identidad{

	public Administrador(String nombre, String apellidos, String id, String mobileNum,
						int edad) {
			super(nombre, apellidos, id, mobileNum, edad);
	}
	
	
	
	/*Equals Hashcode  & toString METHODS*/

	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Administrador) && ((Administrador)obj).getNombre()== this.nombre) {
			return true;
		}else if((obj instanceof Administrador) && ((Administrador)obj).getApellidos()== this.apellidos){
			return true;
		}else if((obj instanceof Administrador) && ((Administrador)obj).getEdad()== this.edad){
			return true;
		}else if((obj instanceof Administrador) && ((Administrador)obj).getId()== this.id){
			return true;
		}else if((obj instanceof Administrador) && ((Administrador)obj).getMobileNum()== this.mobileNum){
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
