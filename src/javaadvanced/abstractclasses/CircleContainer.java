package javaadvanced.abstractclasses;

public class CircleContainer extends Container {

	public double calculateAreaOfBase(int length) {

		double area = Math.PI * (length/2)*(length/2);
		System.out.println("Circle Area = " + area);
		return area;
	}

}
