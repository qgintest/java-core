package javacorepart1.arrays;

public class ExampleTwoDimArray {

	public static void main(String[] args) {

		//2D arrays are seen as matrix
		
								//row column
		int[][] TwoDim = new int[4][3];
		
		//TwoDim[2][1] = 10;
		
		int temp = 10;
		
		for(int i=0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(TwoDim[i][j] = temp);
				System.out.print(" ");
				temp+=10;
			}
			System.out.println();
		}
		
	}

}
