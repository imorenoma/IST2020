
public class ClassB extends ClassA{

	int numero;
	
	public ClassB() {
		super();
		numero = 0;
	}
	
	public void nuevoEscribe() {
		System.out.println("ISoy el nuevo metodo escribe de la ClassB ");
	}
	
	public static void main(String[]args) {
		ClassA objetoA = new ClassA();
		ClassB objetoB = new ClassB();
		ClassA otroA = (ClassA) objetoB;
		ClassA otroMasA = new ClassB(); //Estas dos lineas son equivalentes
		
		objetoA.escribe();
		objetoB.escribe();
		objetoB.nuevoEscribe();
		otroA.escribe();//Puede acceder al metodo de la superclase
		otroA.nuevoEscribe(); //Error, no accesible dede objeto ClassA
		
		
		
	}
}
