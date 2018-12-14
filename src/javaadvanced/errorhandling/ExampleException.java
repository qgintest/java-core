package javaadvanced.errorhandling;

public class ExampleException {

	public static void main(String[] args) {
		int d[] = new int[3];
		int a = 10;
		int b = 0;
		int c = 0;
		
		try{
			//c = a/d compile time exception
			c = a/b; //runtime exception
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
			System.out.println("Array Or Out = " + e);
		}catch(Exception e){
			System.out.println("Exception occured" + e);
			e.printStackTrace();
		}finally{ //will always run whether exception occurs or not
			System.out.println("Always Run");

		}
			
		
		System.out.println("c = " + c);

	}

}
