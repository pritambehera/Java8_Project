package com.hashmap.iterateprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GFG2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("Car", "Bike", "Bus", "Cycle", "Rickshaw"));
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String str : al) {
			hm.put(str, str.length());
		}
		for (Map.Entry<String, Integer> em : hm.entrySet()) {
			System.out.println(em.getKey() + " = " + em.getValue());
		}
		
	Map<String, Integer> m=	 al.stream().collect(Collectors.toMap(Function.identity(),String::length));
		System.out.println(m);
	}
}
