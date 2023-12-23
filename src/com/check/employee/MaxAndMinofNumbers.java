package com.check.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MaxAndMinofNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 2, 4, 3, 6, 2, 7, 3, 8, 9);
//		Integer maxNum = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		Integer maxNum = Stream.of(1, 5, 2, 4, 3, 6, 2, 7, 3, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();

		Integer minNum = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxNum);
		System.out.println(minNum);
	}
}
