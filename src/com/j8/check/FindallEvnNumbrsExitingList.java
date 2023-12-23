package com.j8.check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindallEvnNumbrsExitingList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 12, 11, 13, 15, 14, 18, 16, 28, 29, 23, 33);

		evnNumberExitingList(list);
	}

	private static void evnNumberExitingList(List<Integer> list) {
		// TODO Auto-generated method stub
		List<Integer> ls = list.stream().filter(s -> s % 2 == 0).sorted().collect(Collectors.toList());
		ls.forEach(System.out::println);
	}

}
