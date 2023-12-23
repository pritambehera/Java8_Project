package com.java7.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratingHasMapUsingWhileLoop {
	public static void main(String[] args) {
Map<Long,String > map3 = new HashMap<Long, String>();
map3.put((long) 199, "Rahul");
map3.put((long) 200, "Sha");
map3.put((long) 250, "Sac");
map3.put((long) 200, "Rohit");
map3.put((long) 100, "Robin");
//Map<Long, String> map2 = new HashMap<Long, String>();
Iterator<Entry<Long, String>> it = map3.entrySet().iterator();
while (it.hasNext()) {
	Map.Entry<java.lang.Long, java.lang.String> entry = (Map.Entry<java.lang.Long, java.lang.String>) it.next();
	System.out.println(entry.getKey() + "=" + entry.getValue());

	}

	
	}
}
