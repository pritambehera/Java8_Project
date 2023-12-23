package com.w3source.java8;

import java.util.Arrays;
import java.util.List;

public class FindSecondSmallestAndLargestElement {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		Integer sl = list.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		System.out.println(sl);
		Integer ll = list.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1).findFirst().orElse(null);
		System.out.println(ll);

	}
}
