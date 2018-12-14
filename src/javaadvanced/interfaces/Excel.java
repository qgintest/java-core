package javaadvanced.interfaces;

public class Excel implements Office {

	public void New(){
		System.out.println("Excel New");
	}
	
	public void open(){
		System.out.println("Excel Open");

	}
	
	public void save(){
		System.out.println("Excel Save");

	}
	
}
