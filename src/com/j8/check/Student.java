package com.j8.check;

import java.util.ArrayList;
import java.util.List;

public class Student {
	Integer id;
	String name;
	String subjects;
	Integer marks;

	public Student(Integer id, String name, String subjects, Integer marks) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
		this.marks = marks;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subjects=" + subjects + ", marks=" + marks + "]";
	}

	public static List<Student> getList() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Pritam", "Java", 90));
		list.add(new Student(2, "Vicky", "C", 70));
		list.add(new Student(3, "Mohit", "C++", 75));
		list.add(new Student(4, "Vivek", "Java", 60));

		return list;
	}

}
