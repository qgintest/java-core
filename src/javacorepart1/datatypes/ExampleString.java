package javacorepart1.datatypes;

public class ExampleString {

	public static void main(String[] args) {

		//FULL Disclosure, String is NOT a datatype, it is a special class in Java. refer to examples on classes for more info
		
		//String holds any text value
		String x = "Rick Jumanji";
		System.out.println("hi there " + x);
		
		System.out.println("hi there " + x.toUpperCase());
		
		System.out.println("hi there " + x.toLowerCase());
		
		System.out.println("hi there " + x.substring(2)); //print everything after second string
		
		System.out.println("hi there " + x.substring(2, 7)); //print everything after second string up to not including 7

		System.out.println("hi there " + x.charAt(3)); //print 3rd character
		
		String age = "37";
		
		String salary = "78965.83";
		
		//Wrapper class is a class that wraps the functionality of another class/component to convert primitive data types
		int a = Integer.parseInt(age)/2;
		
		//Autoboxing is when java automatically converts a number primitive to an instance of the corresponding number class
		//e.g., public void someMethod(Integer i)
		Integer myInt = new Integer(10);
		
		//UNboxing: convert number class to primitive 
		Integer i = new Integer(10); //i in this case is an instance, not a primitive
		if(i > 40){
			System.out.println("i > 40");
		}
		
		double db = Double.parseDouble(salary) * .15;
		
		System.out.println(a);
		System.out.println(db);

		//There are wrapper classes for every primitive data type
		
		/*
		 * 8 primitive data types exist in java
		 * 
		 * byte, short, int, long, float, double, char, boolean
		 * 
		 */
		
	}

}
