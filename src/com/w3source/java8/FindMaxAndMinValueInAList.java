package com.w3source.java8;

import java.util.Arrays;
import java.util.List;

public class FindMaxAndMinValueInAList {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		int maxval = li.stream().max(Integer::compare).orElse(null);
		System.out.println(maxval);

		int minval = li.stream().min(Integer::compare).orElse(null);
		System.out.println(minval);
	}
}
