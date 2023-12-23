package com.w3source.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAlistOfStringAlphabaticalOrderAscAndDasc {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
		List<String> sol = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sol);
		List<String> sol2 = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(sol2);
	}
}
