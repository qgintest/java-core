package javaadvanced.interfaces;

public class TestOffice {

	public static void main(String[] args) {

		//Super class object = new subclass
		Office obj = new Word();
		
		//Office obj2 = new Office(); cannot instatiate an instance of an interface
		
		obj.open();
		obj.save();
		
		obj = new Excel();
		
		obj.open();
		obj.save();
		
	}

}
