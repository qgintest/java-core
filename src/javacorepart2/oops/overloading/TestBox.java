package javacorepart2.oops.overloading;

public class TestBox {

	//example of overloading under the concept of polymorphism
	//Overloading: when methods of the same name are differentiated by their passing arguments
	public static void main(String[] args) {

		Box obj = new Box();
		
		obj.calculateArea(4);
		obj.calculateArea(3.7);
		obj.calculateArea(2, 4);
	}

}
