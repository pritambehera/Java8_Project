package com.javatpoints.javastringprograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaximumAndMinimumoccurringcharacterinastring15 {
	public static void main(String[] args) {
		String str = "Grass is greener on the other side";
		int freq[] = new int[str.length()];
		char minChar = str.charAt(0), maxChar = str.charAt(0);
		int i, j, min, max;
//convert giving string  into char array
		char[] ch = str.toCharArray();
//Count each word in given string and store in array freq 
		for (i = 0; i < ch.length; i++) {
			freq[i] = 1;
			for (j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ' && ch[i] != '0') {
					freq[i]++;

					ch[j] = '0';
				}
			}
		}

		// Determine minimum and maximum occurring characters
		min = max = freq[0];
		for (i = 0; i < freq.length; i++) {
			// If min is greater than frequency of a character
			// then, store frequency in min and corresponding character in minChar
			if (min > freq[i] && freq[i] != '0') {
				min = freq[i];
				minChar = ch[i];
			}
			// If max is less than frequency of a character
			// then, store frequency in max and corresponding character in maxChar
			if (max < freq[i]) {
				max = freq[i];
				maxChar = ch[i];
			}
		}

		System.out.println("Minimum occurring character: " + minChar);
		System.out.println("Maximum occurring character: " + maxChar);

//		Stream<Object> map =
//				str.chars()
//				.mapToObj(x -> Character.toLowerCase(Character.valueOf((char) x)))
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
//				.filter(entry -> entry.getKey() == 1L).map(entry -> entry.getValue()).forEach(System.out::print);;
//System.out.println("=================");
	}
}
