package javaregularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp3 {

	//find and replace occurrences
	
	public static void main(String[] args) {

		String str = "Jon ${LastName} Frank Ken Todd";
		
		Pattern pat = Pattern.compile("\\$\\{LastName\\}");
		Matcher mat = pat.matcher(str);
		
		System.out.println("Original sequence " + str);
		
		str = mat.replaceAll("Endale");
		
		System.out.println("Modified sequence" + str);
	}

}
