package com.java7.demo;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharacterFromGvnString {
public static void main(String[] args) {
	String str = "Pritam";
	Map<Character, Long> map = new HashMap<Character, Long>();
	char[] chr = str.toCharArray();
	for (char c : chr) {
		if(map.containsKey(c)) {
			map.put(c,map.get(c)+1);
		}else {
			map.put(c, (long) 1);
		}
	}
	
	for(Map.Entry entry: map.entrySet()) {
		System.out.print(entry.getKey()+"="+ entry.getValue());
	}
}
}
