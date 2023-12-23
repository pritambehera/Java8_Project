package com.javatpoints.javastringprograms;

public class DivideAString_N_EqualParts7 {
	public static void main(String[] args) {
		String str = "aaaabbbbcccc";
		int n = 4;
		int len = str.length();
		int temp = 0, chars = len / n;
		String[] equalStr = new String[n];
		if (len % n != 0) {
			System.out.println("String can not be devide" + n + "parts");
		} else {
			for (int i = 0; i < len; i = i + chars) {
				String parts = str.substring(i, i + chars);
				equalStr[temp] = parts;
				temp++;
			}
			for (int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}
	}
}
