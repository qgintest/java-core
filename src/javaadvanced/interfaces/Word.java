package javaadvanced.interfaces;



public class Word implements Office, Office360 {

	public void New(){
	System.out.println("Word new .doc");
	}
	
	public void open(){
		System.out.println("Word Open .doc");
		}
	
	public void save(){
		System.out.println("Word Save .doc");
	}
	
}
