package com.w3source.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountTheNoOfStringsinAlist {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown","Grey");
		char  stringletter = 'G';
//		long count = list.stream().map(s -> s.startsWith(String.valueOf("e"))).count();
		long count = list.stream().filter(s->s.startsWith(String.valueOf(stringletter))).count();
		System.out.println(count);
	}
}
