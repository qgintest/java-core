package javaadvanced.errorhandling.throwandthrows;


//useful to throw exceptions back to the other class so they are forced to catch it and not allow their 
//program to stop because of potential issues.
public class ProgA {

	public int divideNums(int a, int b) throws Exception{
		
		int c = 0;
		
		try{
			c = a/b;
		}catch(Exception e){
			System.out.println("ProgA Exception");
			throw new Exception("Check your numbers");
		}
		
		return c;
	}
	
}
