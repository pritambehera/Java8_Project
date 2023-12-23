package com.java.mapprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapMain {
	public static void main(String[] args) {

		List<Student> listofStudent = createListOfStudent();
		List<String> strList = listofStudent.stream().map(t -> t.getName()).collect(Collectors.toList());
		System.out.println(strList);
	}

	public static List<Student> createListOfStudent() {
		List<Student> listOfStudents = new ArrayList<>();
//		Student s1 = new Student("Anchit", 20);
//		Student s2 = new Student("Peter", 19);
//		Student s3 = new Student("Martin", 22);
//		Student s4 = new Student("Sam", 21);
//		listOfStudents.add(s1);
//		listOfStudents.add(s2);
//		listOfStudents.add(s3);
//		listOfStudents.add(s4);
		listOfStudents.add(new Student("Anchit", 20));
		listOfStudents.add(new Student("Peter", 19));
		listOfStudents.add(new Student("Martin", 22));
		listOfStudents.add(new Student("Sam", 21));
		return listOfStudents;
	}
}

class Student {
	String Name;
	int age;

	public Student(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", age=" + age + "]";
	}

}
