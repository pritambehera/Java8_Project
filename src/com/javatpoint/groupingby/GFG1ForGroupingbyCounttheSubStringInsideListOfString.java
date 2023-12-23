package com.javatpoint.groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GFG1ForGroupingbyCounttheSubStringInsideListOfString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("geeks", "for", "geeks");
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
//		{geeks=2, for=1}
	}
}
