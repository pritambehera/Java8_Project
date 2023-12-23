package com.geeksforgeeks.javastringprograms;

public class GetACharacterFromAStringUsingJava8Streams {
	public static void main(String[] args) {
		String string = "GeeksForGeeks";
		int index = 5;
		Character ch = string.chars().mapToObj(c -> (char) c).toArray(Character[]::new)[index];
		System.out.println(ch);
	}
}
