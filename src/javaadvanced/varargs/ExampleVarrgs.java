package javaadvanced.varargs;

public class ExampleVarrgs {

	public void addNumbers(String b, int ...a){
		
		int sum = 0;
		
		for(int x: a){
			sum+= x;
		}
		System.out.println("sum = " + sum);
	}
	
	public static void main(String[] args) {
		
		ExampleVarrgs obj = new ExampleVarrgs();
		obj.addNumbers("Abe", 2, 3, 4, 5, 6, 10, 12);
	}
}
