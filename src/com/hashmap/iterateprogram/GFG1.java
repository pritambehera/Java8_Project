package com.hashmap.iterateprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//Java Program to Traverse through HashMap
//Using Iterator
public class GFG1 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Tony", 90);
		hm.put("GeeksforGeeks", 54);
		hm.put("A computer portal", 80);
		hm.put("For geeks", 82);

		System.out.println("Printing all elements of  " + hm);

		Iterator<Entry<String, Integer>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> em = it.next();
			int val= em.getValue()+10;
			System.out.println(em.getKey() + " = " + val);
		}
		
		//java 8  foreach method
		hm.forEach((key , value) -> System.out.println(key+" = "+(value+10)));
	}
}
