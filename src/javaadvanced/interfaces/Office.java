package javaadvanced.interfaces;

//Guarentees the methods listed in the interface will be implemented
//if public is not specified, it will be specified by the default scope.

//an interface with empty methods is called a marker interface. this tells the compiler the objects of the class that 
//implenent the interface need to be treated differently

//An interface with only one method is called a functional interface. marked with an annotation called @FunctionalInterface

/*
 * explanation from youtube
 * What is a Java interface?. It's a contract that states any class implementing this interface can be typed as 
 * the interface and it guarantees the methods listed in the interface will be implemented
 * 
 */

public interface Office {
	
	int numberOfPasseng= 4; //default is public static final for interfaces
	//private static int numberOfPassengerss= 4; //illegal modifier
	public static int numberOfPassengers= 4; //defaulted to final
	public static final int numberOfPassengerS= 4; 
	
	public void New(); //interfaces are only method declarations for the most part
	
	public void open();
	
	public void save();
	
	//Interfaces are contracts, they cannot hold state.
	//if constants are needed, put them in a final class
}
