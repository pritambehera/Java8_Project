package com.java.mapprogram;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class N1HasMapDemoJ7 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("chian", 3000);
		hm.put("Bucky", 2000);
		hm.put("Steve", 50000);
		hm.put("Tony", 80000);
		System.out.println("without sorting and without insertion order");
		System.out.println("HM :" + hm);
		System.out.println("value  modified in a key:");
		hm.put("chian", 9000);
		System.out.println(hm);
		Set<?> set = hm.entrySet();
		System.out.println("Set implementation with entryset: " + set);
		Set set1 = hm.keySet();
		System.out.println("Set implemnentation with keySet:" + set1);
		Collection<Integer> c = hm.values();
		System.out.println("Collection implementation  with  values:" + c);

		;
		Iterator<Map.Entry<String, Integer>> it = (Iterator<Entry<String, Integer>>) set.iterator();
		while (it.hasNext()) {

			Map.Entry<String, Integer> ie = (Map.Entry<String, Integer>) it.next();
			System.out.println(ie.getKey() + "======" + ie.getValue());
			if (ie.getKey().equals("Bucky")) {
				ie.setValue(100000);
			}
			System.out.println(hm);
		}
	}
}
