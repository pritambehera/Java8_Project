package com.java.mapprogram;

import java.util.HashMap;

/*http://makeseleniumeasy.com/2023/03/24/how-to-iterate-map-in-java-using-stream-and-lambda/
*/
public class IterateMapWithLambdaStreams {
	public static void main(String[] args) {
		HashMap<String, String> mapData = new HashMap<>();
		mapData.put("id", "1");
		mapData.put("name", "Amod");
		mapData.put("address", "New York");
		mapData.put("skills", "Java Selenium");
		mapData.put("mob", "969768");

//    using ForEach()
		mapData.forEach((k, v) -> System.out.println("key:" + k + "| value:" + v));
		System.out.println("========================");
//		using KeySet()
		mapData.keySet().forEach(t -> System.out.println("key:" + t + "| val:" + mapData.get(t)));
		System.out.println("=======================");
//		using stream  with ForEach()
		mapData.keySet().stream().forEach(t -> System.out.println("key:" + t + "| val:" + mapData.get(t)));
		System.out.println("===========================");
//		using stream filter and ForEach
		mapData.keySet().stream().filter(t -> !t.equals("name"))
				.forEach(t -> System.out.println("key:" + t + "| val:" + mapData.get(t)));
		System.err.println("====================================");
		mapData.entrySet().stream().filter(t -> !t.getKey().isEmpty())
				.forEach(t -> System.out.println("key:" + t + "| val:" + t));
	}
}
