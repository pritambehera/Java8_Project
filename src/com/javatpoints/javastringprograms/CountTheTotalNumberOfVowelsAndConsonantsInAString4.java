package com.javatpoints.javastringprograms;

public class CountTheTotalNumberOfVowelsAndConsonantsInAString4 {
	public static void main(String[] args) {
		String str = "This is a really simple sentence";
		String str1 = str.toLowerCase();
		int vCount = 0, cCount = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'
					|| str1.charAt(i) == 'u') {
				vCount++;
			} else if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
				cCount++;
			}
			System.out.println(vCount);
		}
		System.out.println("V count" + vCount);
		System.out.println("C count:" + cCount);
	}
}
