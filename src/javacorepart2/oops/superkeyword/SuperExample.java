package javacorepart2.oops.superkeyword;

//Java program to illustrate super() put by 
//compiler always if not provided explicitly

class SuperExample{
	public static void main(String[] args)
	{
		new Base();
		System.out.println("Inside Main");
	}
}

class Parent {
	Parent()
	{
		System.out.println("Parent class's No " + 
						"argument constructor");
		
	}
	Parent(int a)
	{
		System.out.println("Parent class's one " + 
						" argument constructor");
	}
}

class Base extends Parent {
	Base()
	{
		this(10);
		System.out.println("No arg const");
	}
	Base(int a)
	{
		this(10, 20);
		//super(); illegal. super() needs to be first in a constructor call
		System.out.println("1 arg const");
	}
	Base(int k, int m)
	{
		// See here by default compiler put super();
		System.out.println("2 arg const");
	}
	
}

