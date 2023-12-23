package com.j8.check;

import java.util.List;

public class Employee {
	int id;
	String name;
	List<String> citiesWorkeupOn;

	public Employee(int id, String name, List<String> citiesWorkeupOn) {
		super();
		this.id = id;
		this.name = name;
		this.citiesWorkeupOn = citiesWorkeupOn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCitiesWorkeupOn() {
		return citiesWorkeupOn;
	}

	public void setCitiesWorkeupOn(List<String> citiesWorkeupOn) {
		this.citiesWorkeupOn = citiesWorkeupOn;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", citiesWorkeupOn=" + citiesWorkeupOn + "]";
	}

}
