package javaadvanced.abstractclasses;

public class SquareContainer extends Container {

	public double calculateAreaOfBase(int length) {
		
		double area = length * length;
		System.out.println("square Area = " + area);
		return area;
	}

	
	
}
