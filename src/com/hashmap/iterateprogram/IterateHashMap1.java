package com.hashmap.iterateprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IterateHashMap1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(110, "Ravi");
		hm.put(120, "Prateek");
		hm.put(130, "Davesh");
		hm.put(140, "Kamal");
		hm.put(150, "Pawan");
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> em = it.next();
			System.out.println(em.getKey()+" = "+em.getValue());
		}
	}
}
