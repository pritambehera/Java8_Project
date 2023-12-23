package com.javahungry.map;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class No8_GivenaStringFindthefirstrepeatedcharacterinitusingStreamfunctions {
public static void main(String[] args) {
		String input = "Java Hungry Blog Alive is Awesome";
		Character ch = input.chars()
				.mapToObj(v -> Character.toLowerCase(Character.valueOf((char) v)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1L)
				.map(entry -> entry.getKey())
				.findFirst()
				.get();
		System.out.println(ch);
	}
}
