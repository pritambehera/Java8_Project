package com.javatpoints.javastringprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindtheDuplicatecharactersinaString {
	public static void main(String[] args) {
		String string = "Great responsibility";
		char[] ch = string.toCharArray();
//	for(int  i = 0 ; i < ch.length-1 ; i++) {
//		for(int j=i+1; j<ch.length-1;j++) {
//			if(ch[i]==ch[j] && ch[i]!=' ') {
//				System.out.println(ch[i]);
//			}
//		}
//	}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
				System.out.println("dpl map"+ map);
			}
			map.put(c, 1);
		}
		System.out.println("java 7 Map  :" + map);
		Set<Character> set = map.keySet();
		for (Character car : set) {
			if (map.get(car) > 1) {
				System.out.println("Java  7 set after map "+ car + "" + map.get(car));
			}
		}
//java 8 way
		Map<Character, Long> hm = string.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//		.entrySet()
//		.stream()
//		.filter(t ->t.getValue()>1L )
//		.map(t -> t.getKey()).collect(Collectors.toSet());
		System.out.println(hm);
	}
}
