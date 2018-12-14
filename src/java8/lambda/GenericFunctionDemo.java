package java8.lambda;

public class GenericFunctionDemo {

	public static void main(String[] args) {

		//String implementation of functional interface
		GenericFunction<String> reverse = (str) -> {
			String result = "";
			int i;
			
			for(i = str.length()-1; i >=0; i--)
				result += str.charAt(i);
				//result = result + str.charAt(i);
			
			return result;
		};
		
		System.out.println("Lambda reversed is " + reverse.func("Lamda"));
		System.out.println("Expression reversed is " + reverse.func("Expression"));
		System.out.println("Expression reversed is " + reverse.func("aa-78-ghghjkf-784500hjfhjkgdkjzz"));

		//Integer implementation of functional interface
		GenericFunction<Integer> factorial = (n) -> {
			int result = 1;
			
			for(int i=1; i <= n; i++)
				result = i * result;
			
			return result;
		};
		
		System.out.println("The factorial of 3 is " + factorial.func(3));
		System.out.println("The factorial of 3 is " + factorial.func(5));

		
	}

}
