package com.j8.check;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapAndFlatMapExamplWithEmployee {
	public static void main(String[] args) {
		List<String> emplist1 = new ArrayList<String>();
		emplist1.add("Pune");
		emplist1.add("Noida");
		emplist1.add("Bangalore");
		emplist1.add("Mumbai");

		Employee emp1 = new Employee(1, "Pritam", emplist1);

		List<String> emplist2 = new ArrayList<String>();
		emplist2.add("pune");
		emplist2.add("Nagpur");
		emplist2.add("Indore");

		Employee emp2 = new Employee(2, "Vivek", emplist2);

		List<String> emplist3 = new ArrayList<String>();
		emplist3.add("Pune");
		emplist3.add("Bangalore");

		Employee emp3 = new Employee(3, "Vicky", emplist3);

		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		System.out.println(emplist);

//	find only employee based on there id;
//		List<Integer> list = new ArrayList<Integer>();
//		for (Employee em : emplist) {
//			list.add(em.getId());
//		}
//		System.out.println(list);

		List<Integer> idlist = emplist.stream().map(t -> t.getId()).collect(Collectors.toList());
		System.out.println(idlist);

		Set<String> cityLists = emplist.stream().flatMap(stud -> stud.getCitiesWorkeupOn().stream())
				.collect(Collectors.toSet());
		System.out.println(cityLists);
	}
}
