package com.w3source.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertAstringToUpperAndLowercaseChar {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
		System.out.println("========Lowercase");
		List<String> lowercase = list.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		lowercase.forEach(System.out::println);
		System.out.println("========Uppercase");
		List<String> uppercase = lowercase.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		uppercase.forEach(System.out::println);

	}
}
