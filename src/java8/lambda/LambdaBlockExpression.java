package java8.lambda;

public class LambdaBlockExpression {

	public static void main(String[] args) {

		//for block lambdas, you must expliitly define return statement
		//a return simply causes a return from the lambda, it does not cause an enclosing method to return
		NumericFunc factorial = (n) -> {
			int result = 1;
			
			for(int i=1; i <= n; i++)
				result = i * result;
			
			return result;
		};
		
		System.out.println("The factorial of 3 is " + factorial.func(3));
		System.out.println("The factorial of 3 is " + factorial.func(5));

	}

}
