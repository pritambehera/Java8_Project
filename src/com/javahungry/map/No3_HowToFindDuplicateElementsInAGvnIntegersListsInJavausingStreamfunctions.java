package com.javahungry.map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No3_HowToFindDuplicateElementsInAGvnIntegersListsInJavausingStreamfunctions {
	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> set = new HashSet<Integer>();

		myList.stream().filter(t -> !set.add(t)).forEach(System.out::println);
	}
}
