package java8.lambda;

public class LambdaAsArgumentsDemo {
	/*
	 * This method has a functional interface as the type of its first parameter. 
	 * Thus, it can be passed a reference to any instance of that interface; including that of a lambda expression
	 * The second parameter specifies the string to operate on.
	 * 
	 */
	static String stringOp(StringFunc sf, String s){
		return sf.func(s);
	}

	public static void main(String[] args) {

		String inStr = "Lambdas add power to Java";
		String outStr;
		
		System.out.println("Here is the input string: " + inStr);
		
		//simple expression lambda that upper-cases a string is passed to stringOp().
		outStr = stringOp((str) -> str.toUpperCase(), inStr);
		
		System.out.println("This string in uppercase: " + outStr);
		
		//block lambda that removes spaces
		outStr = stringOp((str) ->{
			
			String result = "";
			int i;
			
			for(i = 0; i < str.length(); i++)
				if(str.charAt(i) != ' ')
					result+= str.charAt(i);
			
			return result;
		}, inStr);
		
		System.out.println("This string with spaces removed: " + outStr);
		
		//might look cleaner to pass a StringFunc instance created by an earlier lambda expression. below, reverse refers to an instance of StringFunc
		StringFunc reverse = (str) -> {
			String result = "";
			int i;
			
			for(i = str.length()-1; i>=0; i--)
				result+=str.charAt(i);
			
			return result;
		};
		
		//reverse can be passed as the first parameter to stringOp() since it refers to a StringFunc object
		System.out.println("The string reversed: " + stringOp(reverse, inStr));

	}

}
