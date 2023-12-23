package com.devgenius.java8;

import java.util.Arrays;
import java.util.List;

public class FindOutAllEvenNumbersExitInList {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 9, 8, 2, 3, 7, 4, 6, 5, 0);
	List<Integer> lii=	li.stream().filter(i -> i % 2 == 0).sorted().toList();
		lii.forEach(System.out::print);
	}
}
