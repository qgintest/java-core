package javaadvanced.collections;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {

	public static void main(String[] args) {

		//disadvantage of using arrays is its fixed length, this is where collections come in
		//List is used to hold a colleciton of data
		
		//Non generic list
		List list = new ArrayList(); //List is the super-class of ArrayList
		//ArrayList list = new ArrayList();
		
		//can add any type of object in a list
		list.add("zero");
		list.add("one");
		list.add(2);
		list.add(true);
		
		//internally, every class extends Object. Object is what is common across all the contents within the array above
		for(Object temp : list){
			System.out.println(temp);
		}
		System.out.println("---------------");
		//Generic list can only add specific data type
		List<String> gList = new ArrayList<>();
		
		gList.add("zero");
		gList.add("one");
		gList.add("two");
		
		gList.remove(2);
		gList.remove("Four");
		gList.add(0, "Start");

		
		for(String temp : gList){
			System.out.println(temp);
		}

	}

}
