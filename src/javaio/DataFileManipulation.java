package javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//For updated IO, check out NIO -New Input/Output

public class DataFileManipulation {
	
	static FileInputStream fin = null;
	static FileOutputStream fout = null;

	static int i;

	public static void main(String[] args) throws Exception {

		//confirmLengthOfArgs(2, args.length);
		//confirmLengthOfArgs(2, args.length);

		readCloseFilesAutomatically(args[0]);
		//openFile("in", args[0]);
		//openFile("out", args[1]);

		//readFile();
		//readAndCopyFile();
		//closeFile();

	}
	
	static void openFile(String streamType, String filename){
		
		if(streamType.equalsIgnoreCase("in")){
			
			try{
				fin = new FileInputStream(filename);
			}catch(IOException e){
				System.out.println("Error Reading Line");
			}
			
		}else{
			
			try{
				fout = new FileOutputStream(filename);
			}catch(IOException e){
				System.out.println("Error Reading Line");
			}
		}
	}
	
	static void closeFile(){
		
		//Close the file
		try{
			fin.close();
			fout.close();
		}catch(IOException e){
			System.out.println("Error Closing File");
		}
	}
	
	static void readFile(){
		
		try{
			do{
				i = fin.read();
				if(i != -1) System.out.println((char) i);
			}while(i != -1);
		}catch(IOException e){
			System.out.println("Error Reading File");
		}
	}
	
	static void readAndCopyFile(){
		
		try{
			do{
				i = fin.read();
				if(i != -1) fout.write(i);
			}while(i != -1);
			System.out.println("Copy Complete");
		}catch(IOException e){
			System.out.println("Error Reading File");
		}
	}
	
	static void readCloseFilesAutomatically(String filename) throws Exception{
		//JDK 7 or later try-with-resources ARM-automatic resource management
		try(FileInputStream fin = new FileInputStream(filename)){
			do{
				i = fin.read();
				if(i != -1) System.out.println((char) i);
			}while(i != -1);
		}catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}catch(IOException e){
			System.out.println("An I/O Error Occured");
		}
	}
	
	static void confirmLengthOfArgs(int expectedArgLength, int actualArgLength){
		if(expectedArgLength != actualArgLength){
			System.out.println("Usage: ShowFile filename");
			System.exit(1);;
		}
	}

	
}
