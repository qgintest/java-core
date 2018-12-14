package java8.lambda;

public class VarCapture {

	public static void main(String[] args) {

		int num = 10;
		
		NumericFunc myLambda = n ->{
			
			int v = num + n;
			
			//illegal
			//num++;
			return v;
		};
		
		//num = 9;
	}

}
