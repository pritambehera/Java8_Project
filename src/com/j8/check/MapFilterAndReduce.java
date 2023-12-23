package com.j8.check;

import java.util.Arrays;
import java.util.List;

public class MapFilterAndReduce {
	public static void main(String[] args) {
		String[] strArr = new String[] { "abc", "pritam", "vivek", "mohit" };
		// Map()
		String[] li = Arrays.stream(strArr).map(name -> name.toUpperCase()).toArray(String[]::new);
		System.out.println("Map e.g:" + Arrays.toString(li));

		// Filter()
		String[] li1 = Arrays.stream(strArr).filter(name -> name.length() > 3).map(name -> name.toUpperCase())
				.toArray(String[]::new);
		System.out.println("Filter e.g:" + Arrays.toString(li1));

		// reduce()
		String str1 = Arrays.stream(strArr).reduce("", (t, u) -> t + u);
		System.out.println("Reduce e.g:" + str1);

		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		Integer re = Arrays.stream(arr).reduce(0, Integer::sum);
		System.out.println(re);

		// map(),filter() and reduce

		List<Student> lStud = Student.getList();
		Integer is = lStud.stream()
				.filter(stud -> stud.getSubjects().equalsIgnoreCase("Java"))
				.map(stud -> stud.getMarks())
				.reduce(Integer::sum).get();
		System.out.println(is);
	}
}
