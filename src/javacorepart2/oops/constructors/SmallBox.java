package javacorepart2.oops.constructors;

public class SmallBox {
	
	int length;
	int width;
	
	/*
	 * Constructor: is a method that has the same name as the class.
	 * it is executed when an object is created
	 * it is used to set default values
	 * does not return anything including void
	 * 
	 */
	
	SmallBox(){
		this.length = 5;
		this.width = 6;
		System.out.println("constructor fired");
	}
	
	SmallBox(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	void calculateArea(){
		System.out.println("Area " + (length * width));
	}

}
