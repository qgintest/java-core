package javacorepart2.oops.overloading;

public class Box {

	void calculateArea(int length){
		System.out.println("Area " + (length * length));
	}
	
	void calculateArea(double length){
		System.out.println("Double Area " + (length * length));
	}
	
	void calculateArea(int length, int width){
		System.out.println("Double Area " + (length * width));
	}
	
}
