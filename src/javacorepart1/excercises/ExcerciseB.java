package javacorepart1.excercises;

public class ExcerciseB {

	//add up all the numbers in the array below
	public static void main(String[] args) {

		String[] nums = {"10", "20", "30", "40"};
		int total = 0;
		
		for(String temp: nums){
			total += Integer.parseInt(temp);
			//total = total + Integer.parseInt(temp);

		}
		
		System.out.println("total values for nums is: " + total);

	}

}
