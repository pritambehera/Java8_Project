package com.javahungry.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No2_FindOutAllNumbersStartingWithOneUsingStreamfunFrmGvnList {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		List<String> list = myList.stream().map(t -> t + "").filter(t -> t.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(list);
	}
}
