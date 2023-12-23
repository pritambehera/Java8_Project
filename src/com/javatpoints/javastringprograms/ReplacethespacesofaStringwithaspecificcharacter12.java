package com.javatpoints.javastringprograms;

public class ReplacethespacesofaStringwithaspecificcharacter12 {
	public static void main(String[] args) {
		String str = "Once in a blue moon";
		str = str.replaceAll("\\s", "-");
		System.out.println(str);
	}
}
