package javacorepart2.oops.datahiding;

public class Employee {
	
	private double salary;
	private double bonus;
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	//convention when writing classes, write data as private and put getter and setter methods as public
	void setSalary(double salary){
		
		if(salary >=40000 && salary <= 200000){
			this.salary = salary;
		}else{
			this.salary = 0;
			System.out.println("Please check salary");
		}
	}
	
	double getSalary(){
		return salary;
	}
	
	void calculateTotalPay(){
		double totalPay = salary + bonus;
		System.out.println("Total Pay = " + totalPay);
	}

}
