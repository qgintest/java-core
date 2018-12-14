package javacorepart1.main;

public class MainClass {
	
	/*
	 * A multi-line comment
	 * looks like this!	
	 */
		
		// A single line comment
		
		public static void main(String[] args) {
			/*
			 * main method is where execution starts
			 * it is public because it needs to be accessed from outside the class.
			 * 
			 * it is static because JVM will know that this is main class to instantiate without worrying of 
			 * any additional ambiguities such as constructors being initialized before class is created.
			 * 
			 * it is void because it does not return a value and interpreter does not expect one
			 * main is a keyword that tells the interpreter to compile all the classes
			 * String[] args is an array of instances of class string. passing in arguments allows
			 * the user to input any data type such as integer, characters, etc. its more flexible
			 * 
			 * if a project has two classes with main methods, you can only run one
			 */
		}

}
