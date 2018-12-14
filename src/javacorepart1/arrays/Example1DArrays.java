package javacorepart1.arrays;

public class Example1DArrays {

	public static void main(String[] args) {
		
				//efficient way of storing large amounts of homogenous data - Arrays
		
				int[] a = {10,20,30,40,50};
				
				System.out.println(a[2] + " " + a[4]);
				
				//enhanced for
				for(int tmp: a){
					System.out.println(tmp);
				}
				
				System.out.println("--------------------");
				
				int[] x = new int[5];
				
				x[3] = 25;
				x[0] = 12;
				
				for(int tmp2: x){
					System.out.println(tmp2);
				}
				System.out.println("--------------------");

				
				String[] st = {"one", "two", "three"};
				
				for(String tmp3: st){
					System.out.println(tmp3);
				}
				
				System.out.println("--------------------");
				
				String[] sts = new String[5];
				
				sts[0] = "zero";
				sts[2] = "two";
				
				for(String tmp4: sts){
					System.out.println(tmp4);
				}
				//default of zero will be given for indexes not assigned for int arrays and NULLs for string arrays

	}

}
