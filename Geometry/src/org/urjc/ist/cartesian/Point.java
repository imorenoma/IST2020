package org.urjc.ist.cartesian;

public class Point {
	
	/*Cartesian coords for d-2 points*/
	
	private int x;// x dimension
	private int y; // y dimension
	
	//Setter & getters
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public Point() {
		//Default constructor for class Point
		x = 1;
		y = 1;
	}
	
	public Point(int x, int y) {
		//constructor  with 2 explicit args		
		this(); // Call default constructor
		this.x += x;
		this.y += y;
	}
	
	public static void main(String[] args) {
	
		Point point1 = new Point();	
		Point point2 = new Point(5,3);
		Point point3 = point2;
		Point point4 = new Point(5,3);
		
		System.out.println("Object 1 " + point1);
		System.out.println("x value: " + point1.x); 
		System.out.println("y value: " + point1.y);
		
		System.out.println("Object 2 " + point2);
		System.out.println("x value: " + point2.x); 
		System.out.println("y value: " + point2.y);
		
		System.out.println("object 3" + point3);
		System.out.println("point2 == point4? " + (point3 == point4));
		//no van a ser iguales porque estan apuntando 
		//a distintas direcciones de memoria
	}

}
