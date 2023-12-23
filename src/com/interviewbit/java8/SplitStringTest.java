package com.interviewbit.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SplitStringTest {
	public static void main(String[] args) {
		String animals = "Dog. , Cat, Bird. Cow";
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Collection<String> col = (Collection<String>) Arrays.stream(animals.split("[,|.]"))
				.map(String::trim)
				.filter(next -> !next.isEmpty()).collect(Collectors.toList());
		System.out.println(col);

		List<Integer> list = Arrays.stream(arr).boxed().filter(i->i==i++).limit(3).collect(Collectors.toList());
		System.out.println(list);
	}
}
