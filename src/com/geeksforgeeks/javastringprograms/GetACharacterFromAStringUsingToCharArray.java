package com.geeksforgeeks.javastringprograms;

public class GetACharacterFromAStringUsingToCharArray {
	public static void main(String[] args) {
		String str = "GeeksForGeeks";
		int index = 5;
		char cr = str.toCharArray()[index];
		System.out.println(cr);
	}
}
