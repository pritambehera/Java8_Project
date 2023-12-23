package com.howtodoinjava.lambdaexprson;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Test {//https://marketplace.eclipse.org/marketplace-client-intro?mpc_install=4056021
	public static void main(String[] args) {
BinaryOperator<Integer> biAdd = (a,b)->a+b;
System.out.println(biAdd.apply(12, 30));


		Employee e = new Employee();
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(24));
		empList.add(new Employee(25));
		empList.add(new Employee(36));
		empList.add(new Employee(27));
		empList.add(new Employee(33));
		empList.add(new Employee(38));
		empList.add(new Employee(32));
		empList.add(new Employee(20));
		empList.stream().filter(s->s.getAge() > 30).forEach(System.out::print);
		List<Employee> li= empList.stream().filter(s->s.getAge() > 30).collect(Collectors.toList());
		li.forEach(System.out::println);

	}
}

class Employee {
	private int age;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + "]";
	}

}
