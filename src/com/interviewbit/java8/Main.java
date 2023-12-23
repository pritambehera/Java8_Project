package com.interviewbit.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
	public static void main(String[] args) {
		int[] original = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int splitSize = 3;

		/*
		 * expected Output [0, 1, 2] [3, 4, 5] [6, 7, 8] [9]
		 */

		List<int[]> list = splitArray(original, splitSize);
		list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
	}

	public static List<int[]> splitArray(int[] array, int splitSize) {
		List<Integer> list= new  ArrayList<Integer>();
		
		Stream st =  Stream.iterate(0, i -> i + splitSize).limit((int) Math.ceil((double) array.length / splitSize));
//				.mapToInt(j -> Arrays.copyOfRange(array, j, Math.min(array.length, j + splitSize))).toArray(int[]::new);
		return (List<int[]>) st;

//	 array.stream().map(s -> s + splitSize).boxed().collect(collectors.toList());
//		list.forEach(System.out::println);
	}
}
