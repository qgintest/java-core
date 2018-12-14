package javacorepart2.oops.classesAndObjects;

//objects are a copy/instance of a class
public class TestEmployee {

	public static void main(String[] args) {

		Employee alex = new Employee();
		Employee linda = new Employee();
		Employee john = new Employee();
		
		alex.salary = 90000;
		alex.bonus = 20000;
		
		alex.calculateTotalPay();
		
		linda.salary = 100000;
		linda.bonus = 20000;
		
		linda.calculateTotalPay();

	}

}
