package javaadvanced.finalkeyword;

public  class ExampleFinal {
//public final class ExampleFinal {

	//final keyword can be applied to data, methods, and classes
	//final data is constant
	//final methods cannot be overwritten
	//final classes cannot be sub-classed
	
	final double pi = 3.14;
	
	//public final void MethodA(){
	public  void MethodA(){
		//pi = 4.0;
		System.out.println("pi = " + pi);
	}
	
}
