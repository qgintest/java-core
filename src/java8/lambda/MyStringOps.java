package java8.lambda;

public class MyStringOps {

	//static method that reverses a string
	
	static String strReverse(String str){
		String result = "";
		int i;
		
		for(i = str.length()-1; i >=0; i--)
			result += str.charAt(i);
			//result = result + str.charAt(i);
		
		return result;
	}
	
	 String strReverseObj(String str){
		String result = "";
		int i;
		
		for(i = str.length()-1; i >=0; i--)
			result += str.charAt(i);
			//result = result + str.charAt(i);
		
		return result;
	}
}
