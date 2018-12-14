package java8.lambda;

public class LambdaWithParameter {

	public static void main(String[] args) {

							//type here is implicitly defined within the interface, however you can explicitly define by saying int n
		NumericTest isEven = (n) -> (n % 2) == 0;
		
		if(isEven.test(10))System.out.println("10 is even");
		
		if(!isEven.test(9))System.out.println("9 is not even");
		
								//with one parameter in lambda, you don't have to specify ()
		NumericTest isNonNeg = (n) -> n >=0;
		
		if(isNonNeg.test(1)) System.out.println("1 is non-negative");
		if(!isNonNeg.test(-1)) System.out.println("-1 is negative");


	}

}
