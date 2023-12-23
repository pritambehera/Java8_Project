package com.java.mapprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterationTest2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("V ", " Violet");
		map.put("I ", " Indigo");
		map.put("B ", " Blue");
		map.put("G ", " Green");
		map.put("Y ", " Yellow");
		map.put("O ", " Orange");
		map.put("R ", " Red");
		map.forEach((t, u) -> System.out.println("key:" + t + "value:" + u));
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Object okey = it.next();
			System.out.println(okey);
		}
		it.remove();
		System.out.println(map.entrySet());
	}
}
