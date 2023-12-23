package com.hashmap.iterateprogram;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Gujarat", "Gandhi Nagar");
		map.put("Uttar Pradesh", "Lucknow");
		map.put("Sikkim", "Ganagtok");

		for (String state : map.keySet()) {
			System.out.println(state);
		}
		System.out.println("=========================");
		for (String val : map.values()) {
			System.out.println(val);
		}
	}
}
