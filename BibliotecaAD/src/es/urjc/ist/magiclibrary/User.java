package es.urjc.ist.magiclibrary;

import java.util.*;

public class User {
	
	/*ATTR Section*/
	
	private String nombre;
	private String apellidos;
	private int edad;
	private String id;
	private String mobileNum;
	ArrayList<String> listaPrestamos= new ArrayList<String>();
	private String prestamo1;
	private String prestamo2;
	
	
	/* METHOD SECTION SET/GET */
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String setNombre(String nombre) {
		if(nombre.equals(" ")||nombre.equals("")) {
			this.nombre = "Name is Void";
			return this.nombre;
		}else {
			this.nombre = nombre;
			return this.nombre;
		}
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public String setApellidos(String apellidos) {
		
		if(apellidos.equals(" ")||apellidos.equals("")) {
			this.apellidos = "Surname is Void";
			return this.apellidos;
		}else {
			this.apellidos = apellidos;
			return this.apellidos;
		}		
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public int setEdad(int edad) {
		if(edad <= 0 || edad >100) {
			this.edad = 0;
			return this.edad;
		}else {
			this.edad = edad;
			return this.edad;
		}
	}
	
	public String getId() {
		return this.id;
	}
	
	public String setId(String id) {
		if(id.equals(" ") || id.equals("")){
			this.id = "Void id";
			return this.apellidos;
		}else {
			this.id = id;
			return this.id;
		}
	}
	
	public String getMobileNum() {
		return this.mobileNum;
	}
	
	public String setMobileNum(String mobileNum) {
		if(mobileNum.length() != 9) {
			this.mobileNum= "Bad number";
			return this.mobileNum;
		}else {
			this.mobileNum = mobileNum;
			return this.mobileNum;
		}
	}
	
	/*pseudo codigo prestamo*/
	
	public String prestamo(String item1, String item2) {
		this.prestamo1 = item1;
		this.prestamo2 = item2;
		
		return  this.prestamo1 + " " + this.prestamo2;
	}
	
	
/*Equal and Hashcode Methods*/
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof User) && ((User)obj).getNombre()== this.nombre) {
			return true;
		}else if((obj instanceof User) && ((User)obj).getApellidos()== this.apellidos){
			return true;			
		}else if((obj instanceof User) && ((User)obj).getEdad()== this.edad){
			return true;		
		}else if((obj instanceof User) && ((User)obj).getId()== this.id){
			return true;		
		}else if((obj instanceof User) && ((User)obj).getMobileNum()== this.mobileNum){
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
