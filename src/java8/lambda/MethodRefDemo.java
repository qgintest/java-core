package java8.lambda;

public class MethodRefDemo {

	static String stringOp(StringFunc sf, String s){
		return sf.func(s);
	}
	
	public static void main(String[] args) {

		String inStr = "Lambdas add power to Java";
		String outStr;
		
		//Example of method reference to static methods 
		//ClassName::MethodName
		outStr = stringOp(MyStringOps::strReverse,inStr);
		
		System.out.println("Original string using static method: " + inStr);
		System.out.println("Reversed String using static method: " + outStr);
		
		//Example of method reference for instance methods
		MyStringOps reverse = new MyStringOps();
		
		outStr = stringOp(reverse::strReverseObj,inStr);
		
		System.out.println("Original string using instance method: " + inStr);
		System.out.println("Reversed String using instance method: " + outStr);
		


		
	}

}
