package javaadvanced.errorhandling.throwandthrows;

public class ProgB {

	
	public static void main(String[] args) {

		ProgA obj = new ProgA();
		
		try{
			System.out.println(obj.divideNums(10, 0));
		}catch(Exception e){
			System.out.println("Prog B " + e.getMessage());
		}
		
	}

}
