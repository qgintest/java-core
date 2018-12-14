package javacorepart2.oops.classesAndObjects;

public class Box {

	
	int length; //class level data
	int width;
	
	//method that returns nothing
	void calculateArea(){
		int area = length * width;
		System.out.println("Area: " + area);
	}
	
	//method that returns a value
	int calculateAreaAndReturn(){
		int area = length * width;
		System.out.println("Area: " + area);
		
		return area;
	}
	
	//method that returns a value and has a passing parameter as an argument (passing argument)
	//passing arguments take precedence over class-level data
	int calculateAreaAndReturn(int x){
		int area = length * width * x;
		System.out.println("Area: " + area);
		
		return area;
	}
	
	//to use class level data over passing arguments, use this keyword
	int calculateAreaAndReturn(int x, int y){
		int area = this.length * this.width;
		System.out.println("Area: " + area);
		
		return area;
	}
}
