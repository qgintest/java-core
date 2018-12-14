package javacorepart1.datatypes;

public class JavaDataTypes {

	public static void main(String[] args) {
		
		//What is a DataType? A means to describe how your data will be used. 
		
		//Data Types: most likely to use
		
		int i; //holds whole number
		double db;  //holds decimals
		boolean bool; //holds true/false statements
		String str; //holds....any alphanumeric/numeric character. special data type. widely used.
		
		i = 10;
		db = 10.211;
		bool = true;
		str = "Your going to love me :) i can also store lots of stuff such as special characters !@#$%^&*()-_={}[]\\/?.,<>`~  and numbers 123 4567.89098f";
		
		System.out.println("My stored Integer is: " + i);
		System.out.println("My stored decimal is: " + db);
		System.out.println("My stored boolean value is: " + bool);
		System.out.println("My stored String value is: " + str);

		
		
		//Honorable mentions
		char c;
		byte by;
		short sh;
		long l;
		float fl;
		
		c = 'A';
		by = 10;
		sh = 32;
		l = 32000000;
		fl = 12.34f;
		
		//reference https://www.journaldev.com/6431/java-data-types-primitives-and-binary-literals

	}

}
