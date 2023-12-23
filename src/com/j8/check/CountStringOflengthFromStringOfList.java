package com.j8.check;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountStringOflengthFromStringOfList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "orange", "fig", "abacado");
		Map<String, Integer> map = list.stream().filter(Objects::nonNull).distinct()
				.collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(map);

		int[] arr = list.stream().mapToInt(String::length).toArray();
		System.out.println(Arrays.toString(arr));

		long[] larr = list.stream().mapToLong(s -> s.codePoints().count()).toArray();
		System.out.println(Arrays.toString(larr));
		
//		{banana=6, orange=6, apple=5, fig=3, abacado=7}
//		[5, 6, 6, 3, 7]
//		[5, 6, 6, 3, 7]
	}
}
