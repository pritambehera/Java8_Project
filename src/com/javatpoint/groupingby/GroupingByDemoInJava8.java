package com.javatpoint.groupingby;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByDemoInJava8 {
	public static void main(String[] args) {
		String str = "abc";
		char[] c = str.toCharArray();
		int count = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				count = map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			} else
				map.put(str.charAt(i), 1);
		}
		System.out.println(map);
		Map<Character, Long> hm = str.chars().mapToObj(value -> Character.toLowerCase(Character.valueOf((char) value)))
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
		System.out.println(hm);
		
//		char ch[]= {'a','b','c'};
//		String s= new String(ch);
//		System.out.println(s);
//		double z= Math.pow(2.0, 3.0);
//		System.out.println(z);
//		ArrayList< String> a= new ArrayList<String>();
//		
//		a.add("A");
//		a.add("B");
//		a.add("C");
//		a.add(1,"D");
//		System.out.println(a);
//		int [] arr= new int[5];
//		
//		byte x=64;
//		int i;
//		byte y;
//		i=x<<2;
//		y=(byte)(x<<2);
//		System.out.println(i+""+y);

		// if(args.length>0)
//	System.out.println(args.length);

//		int arr[]= {1,2,3,4,5};
//for (int i = 0; i < arr.length-2; i++) {
//	System.out.println(arr[i]+" ");
//}

		// int x;
//		x=5;
//		{
//			int y=6;
//			System.out.println(x+""+y);
//		}
//		System.out.println(x+""+y);

//		List<Employee> emp = new ArrayList<>();
//		emp.add(new Employee("Dipak", "Delhi", 21));
//		emp.add(new Employee("Sumit", "Delhi", 21));
//		emp.add(new Employee("Karan", "Delhi", 23));
//		emp.add(new Employee("Mona", "Udaipur", 23));
//		emp.add(new Employee("Rajesh", "Banglore", 23));
//		emp.add(new Employee("Niraj", "Banglore", 31));
//
//		Map<String, List<String>> map = new HashMap<String, List<String>>();
////		Group by Employees by city in Java 7 way 
////		for (Employee e : emp) {
////			if (!map.containsKey(e.getCity())) {
////				map.put(e.getCity(), new ArrayList<String>());
////			}
////			map.get(e.getCity()).add(String.valueOf(e));
////		}
////		System.out.println(map);
//
////		 group objects of Employee class by City in Java 8
//		emp.stream().collect(Collectors.groupingBy(Employee::getCity));
//		System.out.println(map);
//
////		 group Employees by age
//		Map<Integer, List<Employee>> cMap = emp.stream().collect(Collectors.groupingBy(Employee::getAge));
//		System.out.println("Employee class Group by Age:" + cMap);
//		// group Employee by age and name;
//		Map<Integer, List<String>> anMap = emp.stream().collect(
//				Collectors.groupingBy(Employee::getAge, Collectors.mapping(Employee::getName, Collectors.toList())));
//		System.out.println("Name map with Age :" + anMap);
//		Map<String, List<String>> lm = emp.stream().collect(
//				Collectors.groupingBy(Employee::getName, Collectors.mapping(Employee::getCity, Collectors.toList())));
//		System.out.println("city with name :" + lm);

	}
}
