package com.javatpoints.javastringprograms;

public class PermuteString9 {

	public static void main(String[] args) {
		String str = "ABC";
		int len = str.length();
		generatePermutation(str, 0, len);
	}

	private static void generatePermutation(String str, int start, int end) {
		if (start == end - 1) {
			System.out.println(str);
		} else {
			for (int i = start; i < end; i++) {
				str = swapString(str, start, i);
				generatePermutation(str, start + 1, end);
				str = swapString(str, start, i);
			}
		}

	}

	private static String swapString(String str, int i, int j) {
		char[] c = str.toCharArray();
		char temp;
		temp = c[i];
		c[i] = c[j];
		c[j] = temp;
		return String.valueOf(c);
	}
}
