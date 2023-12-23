package com.javatpoints.javastringprograms;

public class FindAllSubsetsOfAString8 {
	public static void main(String[] args) {
		String str = "FUN";
		int len = str.length();
		int temp = 0;
		String[] sArr = new String[len * (len + 1) / 2];
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				sArr[temp] = str.substring(i, j + 1);
				temp++;
				System.out.println(temp);
			}
		}
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
	}
}
