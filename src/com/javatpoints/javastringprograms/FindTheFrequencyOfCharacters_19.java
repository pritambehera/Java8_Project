package com.javatpoints.javastringprograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheFrequencyOfCharacters_19 {
	public static void main(String[] args) {
		String str = "Perfect Picture";
		char[] string = str.toCharArray();
		int[] freq = new int[str.length()];
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			freq[i]=1;
			for (int j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j]) {
					freq[i]++;
//					
					string[j] = '0';
				}
			}
		}
		for (int i = 0; i < freq.length; i++) {
			if (string[i] != ' ' && string[i] != '0') {
				System.out.println(string[i] + "-" + freq[i]);
			}
		}

		System.out.println("==========================java 8==============================");

		Map<Character, Long> cMap = str.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(cMap);
	}
}
