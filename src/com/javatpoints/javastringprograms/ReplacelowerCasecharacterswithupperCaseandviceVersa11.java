package com.javatpoints.javastringprograms;

public class ReplacelowerCasecharacterswithupperCaseandviceVersa11 {
	public static void main(String[] args) {
		String str = "Great Power";
		StringBuffer sb = new StringBuffer(str);
		for (int i = 0; i < str.length() - 1; i++) {

			if (Character.isLowerCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));

			} else if (Character.isUpperCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println(sb);
	}
}
