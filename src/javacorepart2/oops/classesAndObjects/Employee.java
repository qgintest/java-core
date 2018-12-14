package javacorepart2.oops.classesAndObjects;

//class is a template for an object. it contains data and methods.

//Encapsulation: data and methods that act on the data.
public class Employee {

	double salary;
	double bonus;
	
	void calculateTotalPay(){
		double totalPay = salary + bonus;
		System.out.println("Total Pay: " + totalPay);
	}
	
}
