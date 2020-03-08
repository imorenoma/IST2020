package es.urjc.ist.magiclibrary;

public class Identidad {
	
	public String nombre;
	protected String apellidos;
	protected String id;
	protected String mobileNum;
	protected int edad;	
	
	public Identidad(String nombre, String apellidos, String id, String mobileNum, int edad){
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setId(id);
		this.setMobileNum(mobileNum);
		this.setEdad(edad);
		
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public String setNombre(String nombre) {
		if(nombre.equals("")||nombre.equals(" ")) {
			nombre = "Error Name is void";
			this.nombre = nombre;
			return this.nombre;
			
		}else if(nombre.length() <= 25 || nombre.length() >= 2) {
			this.nombre = nombre;
			return this.nombre;
		}else {
			nombre = "Fail";
			this.nombre = nombre;
			return this.nombre;
		}
		
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public String setApellidos(String apellidos) {
		if(apellidos.equals("") || apellidos.equals(" ")) {
			apellidos = "Apellidos is void";
			this.apellidos = apellidos;
			return this.apellidos;
		}else if(apellidos.length()>=2 || apellidos.length() <= 30){
			this.apellidos = apellidos;
			return this.apellidos;
		}else {
			apellidos="Fail Apellidos";
			this.apellidos = apellidos;
			return this.apellidos;
		}
	}
	
	
	public String getId() {
		return this.id;
	}
	
	public String setId(String id) {
		if(id.equals("") || id.equals(" ")) {
			id = "Id is void";
			this.id = id;
			return this.id;
		}else if(id.length() !=9) {
			id = "length of id is 9";
			this.id = id;
			return this.id;
		}else {
			id = "id Error";
			this.id=id;
			return this.id;
		}
	}
	
	public String getMobileNum() {
		return this.mobileNum;
	}
		
	public String setMobileNum(String mobileNum) {
		if(mobileNum.equals("") || mobileNum.equals(" ")) {
			mobileNum = "mobileNum is void";
			this.mobileNum = mobileNum;
			return this.mobileNum;
		}else if(mobileNum.length() !=9) {
			id = "length of id is 9";
			this.mobileNum = mobileNum;
			return this.mobileNum;
		}else {
			mobileNum = "mobileNum Error";
			this.mobileNum = mobileNum;
			return this.mobileNum;
		}
	}
			
	public int getEdad() {
		return this.edad;
	}	
		
	public int setEdad(int edad) {
		if (edad < 0 || edad > 130) {
			edad = 0;
			this.edad = edad;
			return this.edad;
		}else {
			this.edad = edad;
			return this.edad;
		}
	}
}
