package com.j8.check;

import java.util.Arrays;
import java.util.List;

public class StreamAndParallelStreamDiff {
	public static void main(String[] args) {
		List<String> elements = Arrays.asList("Welcome To", "", "G", "A", "I", "N", "", "J", "A", "V", "A", "", "K",
				"N", "O", "W", "L", "E", "D", "G", "E");
		// Stream (Sequential Stream)
		Long startTime = System.currentTimeMillis();
		elements.stream().forEach(System.out::print);

		Long endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time taken by Sequential Stream: " + (endTime - startTime));

		// ParallelStream
		Long start1 = System.currentTimeMillis();
		elements.stream().parallel().forEachOrdered(System.out::print);
//		.forEach(System.out::print);
		Long end1 = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time Taken by Parallel Stream:" + (end1 - start1));
	}
}
