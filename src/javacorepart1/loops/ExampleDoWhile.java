package javacorepart1.loops;

public class ExampleDoWhile {

	public static void main(String[] args) {
		int x = 10;
		
		//do-while statements will run at least once compared to the while statement it checks the condition after it enters the loop the first time.
		do{
			System.out.println("x " + x);
			x--;
		}while(x > 0);
	}

}
