package com.javatpoints.javastringprograms;

public class RemoveWhiteSpace10 {
	public static void main(String[] args) {
		String str = "Remove white spaces";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
		char[] ch = str.toCharArray();
		char temp;
		for (int i = 0, j = ch.length-1; i < (ch.length/2); i++, j--) {
			temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			
		}
		System.out.println(ch);
	}
}
