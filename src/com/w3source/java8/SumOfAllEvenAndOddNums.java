package com.w3source.java8;

import java.util.Arrays;
import java.util.List;

public class SumOfAllEvenAndOddNums {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		int evn = list.stream().filter(i -> i % 2 == 0).reduce(0, Integer::sum);
		int evn  = list.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(evn);

//		int odd = list.stream().filter(i -> i % 2 != 0).reduce(0, Integer::sum);
		int odd = list.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println(odd);

	}
}
