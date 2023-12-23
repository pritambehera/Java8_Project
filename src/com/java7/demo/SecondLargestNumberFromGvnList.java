package com.java7.demo;

import java.util.Arrays;

public class SecondLargestNumberFromGvnList {
public static void main(String[] args) {
	int[] arr = { 100, 15, 23, 70, 89, 98, 45, 30, 38 };
	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==arr.length-2) {
			System.out.println(arr[arr.length-2]);
		}
//		System.out.println(arr[i]);
	}
}
}
