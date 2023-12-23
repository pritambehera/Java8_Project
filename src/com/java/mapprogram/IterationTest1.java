package com.java.mapprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterationTest1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("V ", " Violet");
		map.put("I ", " Indigo");
		map.put("B ", " Blue");
		map.put("G ", " Green");
		map.put("Y ", " Yellow");
		map.put("O ", " Orange");
		map.put("R ", " Red");
		System.out.println("map :" + map);

		System.out.println("==key-value==");
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Object objkey = it.next();
			System.out.println("objKey:" + objkey);
		}

		System.out.println("==Keys==");
		Iterator<String> it1 = map.keySet().iterator();
		while (it1.hasNext()) {
			Object skey = it1.next();
			System.out.println(skey);
		}
		System.out.println("===values===");
		Iterator<String> it2 = map.values().iterator();
		while (it2.hasNext()) {
			Object val = it2.next();
			System.out.println(val);
		}
	}
}
