package com.check.employee;

import java.util.Arrays;
import java.util.List;

public class SummationOfNums {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 3, 4, 5, 6, 7);
		int[] arr = { 1,2, 3, 4, 5, 6, 7 };
		int sum = li.stream().reduce(0, Integer::sum);
		System.out.println(Arrays.stream(arr).reduce(0, Integer::sum));
		System.out.println(sum);
	}
}
