package com.javatpoints.javastringprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindTheDuplicateWordsinaString18 {
	public static void main(String[] args) {
		String string = "big black bug bit a big black dog on his big black nose";
//	int count=0;
//	string = string.toLowerCase();
//	String[] word = string.split(" ");
//	for(int i=0;i<word.length;i++) {
//		count=1;
//		for(int j=i+1;j<word.length;j++) {
//			if(word[i].equals(word[j])) {
//				count++;
//				word[j]="0";
//			}
//			
//		}
//		
//		if(count>1 && word[i]!="0") {
//			System.out.println(word[i]);
//		}

		System.out.println("==================split the string & Using stream api & set ====================");

		List<String> list = Arrays.stream(string.split(" ")).collect(Collectors.toList());
		System.out.println(list);
		Set<String> set = new HashSet<String>();

		List<String> list4 = list.stream().filter(t -> !set.add(t)).collect(Collectors.toList());
		System.out.println(list4);

		System.out.println(
				"==================Using split() method & stream api & toMap() method ========================");
		System.out.println(
				">>>>>>>>>>>>>Suppose we want to count the occurrences of each word in the sentence then we can collect the words using toMap() and "
						+ "count the occurences with Math::addExact.<<<<<<<<<<<<<<<<<<");

		List<String> list5 = Arrays.stream(string.split(" ")).collect(Collectors.toList());

//		Map<String, Integer> wordsMapWithCount = list5.stream()
//		        .collect(Collectors.toMap(Function.identity(), word -> 1, Math::addExact));

		Map<String, Integer> map = list5.stream()
				.collect(Collectors.toMap(Function.identity(), word -> 1, Math::addExact));

		System.out.println(map);

		System.out.println("=======Occurance of each character ========");
		Map<Character, Long> ch = string.chars().mapToObj(v -> Character.toLowerCase(Character.valueOf((char) v)))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(ch);
		System.out.println("=============================================");
		System.out.println("=========If we want to find only the duplicate words and their number of occurences then we can filter() the above Map as follows:==========");
		
		Map<String, Integer> dupWordsMapWithCount = map.entrySet()
			    .stream().filter(e -> e.getValue() > 1)
			    .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
		System.out.println(dupWordsMapWithCount);
		
		System.out.println("==================Find Duplicate Words using Collections========================");
	
		List<String> list6 = Arrays.asList(string.split(" "));
		Set<String> set1 = new HashSet<String>();
		List<String> list7 = new ArrayList<String>();
		for(String str :list6) {
			if(!set1.add(str)) {
				list7.add(str);
			}
		}
		System.out.println(list7);
		System.out.println("========================================");
		
		List<String> list8 = Arrays.asList(string.split(" "));
		Map<String, Integer> map3 = new HashMap<String, Integer>();
		for(String str1 : list8) {
			map3.put(str1, Collections.frequency(list8, str1));
		}
		System.out.println(map3);
	}
}
