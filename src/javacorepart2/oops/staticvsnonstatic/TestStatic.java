package javacorepart2.oops.staticvsnonstatic;

public class TestStatic {

	public static void main(String[] args) {

		ExampleStatic obj = new ExampleStatic();
		//ExampleStatic obj2 = new ExampleStatic();

		obj.staticMethod();
		obj.staticMethod();
		
		ExampleStatic.staticMethod();
		
		obj.nonStaticMethod();
		obj.nonStaticMethod();
		
		System.out.println("-------");
		
		ExampleStatic obj2 = new ExampleStatic();
		
		obj2.staticMethod();
		obj2.staticMethod();
		
		obj2.nonStaticMethod();
		obj2.nonStaticMethod();

		
	}

}
