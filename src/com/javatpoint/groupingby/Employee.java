package com.javatpoint.groupingby;

import java.util.Objects;

/**
 * 
 */
public class Employee {
	private String name;
	private String city;
	private int age;

	public Employee(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 79 * hash + Objects.hashCode(this.name);
		hash = 79 * hash + Objects.hashCode(this.city);
		hash = 79 * hash + this.age;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(city, other.city) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", age=" + age + "]";
	}

}
