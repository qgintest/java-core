package javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
	
	static BufferedReader br;
	
	static{
		 br = new BufferedReader(new InputStreamReader(System.in));

	}

	public static void main(String[] args) throws IOException {

		
		//readCharactersFromInput();
		readStringFromInput();
		//readMultilpleStringFromInput();
		
	}
	
	static void readCharactersFromInput() throws IOException{
		
		char c;		
		System.out.println("Enter characters, 'q' to quit");
		
		//read characters
		do{
			c = (char) br.read();
			System.out.println(c);
		}while(c != 'q');
		
	}
	
	static void readStringFromInput() throws IOException{
		
		String str;
		System.out.println("Enter string, 'quit' to exit");

		do{
			str = br.readLine();
			System.out.println(str);
		}while(!str.equals("quit"));
		
	}
	
	static void readMultilpleStringFromInput() throws IOException{
		
		String str[] = new String[100];
		System.out.println("Enter lines of text");
		System.out.println("Enter 'quit' to exit");

		for(int i=0; i<100; i++){
			str[i] = br.readLine();
			if(str[i].equals("stop")) break;
		}
		
		System.out.println("\nHere is your file");
		
		//display the lines
		for(int i=0; i<100; i++){
			if(str[i].equals("stop")) break;
			System.out.println(str[i]);
		}
	}


}
