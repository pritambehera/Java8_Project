package com.javahungry.map;

import java.util.Arrays;
import java.util.List;

/*https://javahungry.blogspot.com/2020/05/java-8-coding-and-programming-interview-questions.html
*/

public class No1_FindOutAllEvenNumbersFromLists {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().filter(t -> t % 2 == 0).forEach(System.out::println);
	}
}
