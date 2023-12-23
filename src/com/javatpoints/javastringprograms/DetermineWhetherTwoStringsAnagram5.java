package com.javatpoints.javastringprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DetermineWhetherTwoStringsAnagram5 {
	public static void main(String[] args) {
		String str1 = "Brag", str2 = "Grab";
		String str3 = str1.toLowerCase();
		String str4 = str2.toLowerCase();
		if (str3.length() == str4.length()) {
		
			char[] ch1 = str3.toCharArray();
			char[] ch2 = str4.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
				System.out.println("Strings are anagram");
			}
		} else {
			System.out.println("Strings are not anagram");
		}

		
	}
}
