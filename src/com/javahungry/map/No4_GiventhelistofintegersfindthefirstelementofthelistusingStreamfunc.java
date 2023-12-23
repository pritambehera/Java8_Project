package com.javahungry.map;

import java.util.Arrays;
import java.util.List;

public class No4_GiventhelistofintegersfindthefirstelementofthelistusingStreamfunc {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		 myList.stream().findFirst().ifPresent(System.out::println);
//				.get();
//		System.out.println(first);
	}
}
