package javacorepart1.loops;

public class ExampleEnhancedFor {

	public static void main(String[] args) {
		
		String[] names = {"Abe", "Emma", "Lola", "Meesha", "Bernard", "Jimbo"};
		
		System.out.println("Enhanced For Loop begins*****************\n");
		
		for(String name: names){
			System.out.println("name:" + name);
		}
		
		System.out.println("*****************\n");
		
		
		System.out.println("Old school For Loop begins*****************\n");
		
		//A more verbose way of printing out names
		for(int i = 0; i < names.length; i++){
			System.out.println("name:" + names[i]);
		}
		
		System.out.println("*****************\n");
	}
}
