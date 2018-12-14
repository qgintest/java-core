package javaadvanced.abstractclasses;

//abstract classes exist to be extended. they cannot be instantiated
public abstract class Container {

	public void calculateVolume(int length, int height){
		double volume = calculateAreaOfBase(length) * height;
		System.out.println("Volume: " + volume);
	}
	
	public abstract double calculateAreaOfBase(int length);
	
}
