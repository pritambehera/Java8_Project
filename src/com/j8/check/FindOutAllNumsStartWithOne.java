package com.j8.check;

import java.util.Arrays;
import java.util.List;

public class FindOutAllNumsStartWithOne {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(16, 12, 61, 20, 35, 13, 14, 19, 211, 111);
		list.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
	}
}
