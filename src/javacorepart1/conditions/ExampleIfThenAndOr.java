package javacorepart1.conditions;

public class ExampleIfThenAndOr {

	public static void main(String[] args) {
		int x, y;
		
		x = 10;
		y = -10;
		
		if(x > 0 && y > 0){ // && = and
			System.out.println("both nums are positive");
		}else if(x > 0 || y > 0){ // || = or
			System.out.println("one number is positive");
		}else{
			System.out.println("both nums are negative");
		}
		
		//single & will check both conditions. the double && will stop after first condition is false this is called
		//short-circuiting
		//TODO: figure out when to use single & and |

	}

}
