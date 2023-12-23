package com.java.mapprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItareteMapInJava8 {
	public static void main(String[] args) {
		// Creating a list of Prime Numbers
		List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);

		// Creating a list of Odd Numbers
		List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

		// Creating a list of Even Numbers
		List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

		List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
		System.out.println("before flattering :" + listOfListofInts);
		List<Integer> flatList = listOfListofInts.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println("After flattening :" + flatList);
	}
}
