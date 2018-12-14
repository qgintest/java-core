package java8.lambda;

public class LambdaBlockExpressionTwo {

	public static void main(String[] args) {

		StringFunc reverse = (str) -> {
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


		
	}

}
