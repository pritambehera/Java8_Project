package com.javatpoints.javastringprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheduplicateCharactersinString17 {
	public static void main(String[] args) {
		String str = "Javatpointforjava";
		int count=0;
	Map<Character, Long> map =new HashMap<Character, Long>();
	char[] c = str.toCharArray();
	for(int  i=0;i<c.length;i++) {
		count=1;
		for(int j=i+1;j<c.length;j++) {
			
		if(c[i]==c[j] && c[i]!=' ') {
			count++;
			
			c[j]='0';
		}
		if(count>1 && c[i]!=0) {
			System.out.print(c[i]);
		}
	}
	}
	System.out.println(count);
	}
}
