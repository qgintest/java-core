package javacorepart2.oops.datahiding;

public class TestEmployee {

	public static void main(String[] args) {

		Employee alex = new Employee();
		
		alex.setSalary(1000000);
		alex.setBonus(20000);
		
		alex.calculateTotalPay();
		
		System.out.println(alex.getSalary());
	}

}
