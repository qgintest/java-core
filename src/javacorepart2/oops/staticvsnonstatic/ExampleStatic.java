package javacorepart2.oops.staticvsnonstatic;

//static: one per class. not one per object. useful for counters
//when static is reused, the same copy is used as with objects a fresh copy is created each time
public class ExampleStatic {

	//static data
	static int staticVariable;
	
	//non-static variable
	int nonStaticVariable;
	
	//static method
	static public void staticMethod(){
		System.out.println("staticVariable = " + staticVariable);
		staticVariable++;
		//staitc methods can only access other static data & methods
	}
	
	public void nonStaticMethod(){
		System.out.println("nonStaticVariable = " + nonStaticVariable);
		nonStaticVariable++;
	}
	
	static{
		System.out.println("Static block of code");
	}
	
	ExampleStatic(){
		System.out.println("constructor fired");
	}
}
