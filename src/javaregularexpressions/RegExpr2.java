package javaregularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Finding a match and all occurences example

public class RegExpr2 {

	public static void main(String[] args) {

		Pattern pat = Pattern.compile("Java");
		Matcher mat = pat.matcher("Java obama Java 8 Java great, Java my man");
		
		System.out.println("Looking for Java in Java 8");
		
		//if(mat.find()) {
			System.out.println("subsequence found");
			while(mat.find()){
				System.out.println("java found at index " + mat.start());
			}	
		//}
		//else System.out.println("No match");
		

	}

}
