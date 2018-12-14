package java8.lambda;

public class LambdaNoParameter {

	/*
	 * Lambda expression: anonymous (unnamed) method. it is used to implement a method defined by a functional 
	 * interface
	 * 
	 * Functional interface contains one and only one abstract method typically represents a single action. 
	 * also, defines the target type of a lambda expression **labmda expression can be used only in a context in which
	 * its target type is specified. SAM(Single abstract method)
	 * 
	 * lambda operator =          0 or more parameters -> action
	 */
	
	public static void main(String[] args) {
		
		MyNumber myNum; //declare an interface reference
		
		
		myNum = () -> 123.45; //similar to constant expression. when number is assigned, a class instance is constructed
		//in which the lambda expression implements the getValue() method in MyNumber
		
		System.out.println("fixed value: " + myNum.getValue());
		
		myNum = () -> Math.random() * 100;
		
		System.out.println("random value: " + myNum.getValue());
		System.out.println("random value 2: " + myNum.getValue());
		
		//lambda expression must be compatible with the method defined by the functional interface
		//myNum = () -> "123.03"; //compile-time Error
	}
}
