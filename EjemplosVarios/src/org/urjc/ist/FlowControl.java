package org.urjc.ist;

public class FlowControl {
	
	public static void buclfor(double num) {
		if(num>10.) {
			num--;
		}else if(num < 5.) {
			num++;
		}else {
			num = Math.pow(num, 2.);
		}
		System.out.println("el valor de a es: "+ num);
		
	}
	
	public static void buclwhile(int counter) {
		
		while(counter < 10) {
			
			counter++;
		}
		
		System.out.println("he contado hasta: " + counter);
		
	}
	public static void buclfor() {
		
		for(int i = 1; i < 11 ; i++) {
			System.out.println("Count is: " + i);
		}
		
		for(int i = 10 ; i > 0 ; i--) {
			System.out.println("Inverse Count is: " + i);
		}
	}

	public static void main(String[] args) {
		double a = 11.;
		int count = 1;
		//int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		buclfor(a);
		buclwhile(count);
		buclfor();
		
		
		
		
		
		

	}

}
