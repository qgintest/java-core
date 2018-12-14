package javaregularexpressions;

import java.util.regex.*;

public class RegExpr {

	public static void main(String[] args) {

		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat = Pattern.compile("Java");
		mat = pat.matcher("Java");
		found = mat.matches();
		
		System.out.println("Testing Java against Java.");
		
		if(found) System.out.println("Matches");
		else System.out.println("No match");
		
		System.out.println();
		
		System.out.println("Testing Java against Java 8.");
		mat = pat.matcher("Java 8"); //new matcher
		
		found = mat.matches();

		if(found) System.out.println("Matches");
		else System.out.println("No match");
		
		
	}

}
