package com.w3source.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDulpicatesFromList {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
	Set<Integer> set = new HashSet<Integer>();
//	list.stream().filter(i->!set.add(i)).forEach(System.out::println);
	
	List<Integer> duplicateNos= list.stream().distinct().collect(Collectors.toList());
	System.out.println(duplicateNos);
}
}
