package com.javatpoints.javastringprograms;

public class FindReverseoftheString16 {
	public static void main(String[] args) {
		String str = "Dream big";
		String reverseOrd = " ";
		
		for (int i = str.length() - 1; i >=0; i--) {
			
			reverseOrd+=str.charAt(i);

		}
		System.out.println(reverseOrd);
	}
}
