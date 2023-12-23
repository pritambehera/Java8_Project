package com.howtodoinjava.lambdaexprson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * Using lambda expression to iterate over a List and perform some action on
 * list items
 */
public class TestLambdaEx1 {

	public static void main(String[] args) {
//		List<String> pointlist = new ArrayList<String>();
//		pointlist.add("123");
//		pointlist.add("234");
//		pointlist.add("456");
//		pointlist.add("789");
//		System.out.println(pointlist);
//		pointlist.forEach(p -> {
//			System.out.println(p);
//		});
		
		Map<Long, String> map =new HashMap<Long, String>();
		map.put((long) 10, "Pritam");
		map.put((long) 11, "Ritam");
		map.put((long) 12, "itam");
		map.put((long) 13, "Tam");
		map.put((long) 14, "Am");
		map.put((long) 15, "Pam");
		
		
		Iterator<Entry<Long, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
		Entry<Long, String> map2 = it.next(); 
		System.out.println(map2.getKey() +"="+ map2.getValue());
		
//			System.out.println(map2);
		}
		
		
	}
}
