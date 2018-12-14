package javaadvanced.collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, Double> hm = new HashMap<>();
		
		hm.put("Alex", 98765.44);
		hm.put("Linda", 98765.44);
		hm.put("John", 98765.44);
		
		
		System.out.println(hm.get("Linda"));
		
		//other collecitons exist such as LinkedList, SetMap, etc.

	}

}
