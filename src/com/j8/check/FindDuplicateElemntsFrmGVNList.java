package com.j8.check;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElemntsFrmGVNList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 11, 27, 25, 24, 23, 13, 10, 27, 25, 24, 15, 14, 13, 16, 17, 18, 19, 17,
				19, 13, 14);
		Set<Integer> set = new HashSet<Integer>();
		list.stream().filter(s -> !set.add(s)).forEach(System.out::println);
	}
}
