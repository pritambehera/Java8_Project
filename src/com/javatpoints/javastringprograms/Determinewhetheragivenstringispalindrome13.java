package com.javatpoints.javastringprograms;

public class Determinewhetheragivenstringispalindrome13 {
	public static void main(String[] args) {
		String str = "Kayak";
		str = str.toLowerCase();
		boolean flag = false;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Given string is palindrom");
		} else {
			System.out.println("Given string is not palindorm");
		}
	}
}
