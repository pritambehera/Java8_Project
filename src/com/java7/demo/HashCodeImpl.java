package com.java7.demo;

import java.util.Objects;

public class HashCodeImpl {
public static void main(String[] args) {
	Student student = new Student();
	Student student1 = new Student();
	Student student2 = new Student();
System.out.println(student.toString());
System.out.println(student1.toString().equals(student.toString()));
System.out.println(student2.toString());
}

}
class Student{
	String name;
	int rollNo;

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNo == other.rollNo;
	}
	
	
	
	
	
	
}