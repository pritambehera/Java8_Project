package com.java7.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumberUsingCollection {
	public static void main(String[] args) {
		Integer[] arr = { 100, 15, 23, 70, 89, 98, 45, 30, 38 };
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);
		int res = list.get(arr.length - 2);
		System.out.println(res);
	}
}
