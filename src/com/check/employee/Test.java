package com.check.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
public static void main(String[] args) {
	
	Employee e = new Employee();
	List<Employee> list  = new ArrayList<Employee>();
	list.add(new Employee(1,2,45));
	list.add(new Employee(2,3,44));
	list.add(new Employee(2,7,46));
	list.add(new Employee(2,2,47));
	list.add(new Employee(1,2,45));
//	list.stream().collect(Collectors.groupingBy(Employee::getEmpcode),)
	Map<Integer, Set<Integer>> namesByCity
	   = list.stream().collect(
	   Collectors.groupingBy(Employee::getEmpcode,Collectors.mapping(Employee::getWbsid,Collectors.toSet())));
	System.out.println(namesByCity);
}
}
class Employee{
	private int prcId;
	private int empcode;
	private int wbsid;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int prcId, int empcode, int wbsid) {
		super();
		this.prcId = prcId;
		this.empcode = empcode;
		this.wbsid = wbsid;
	}
	public int getPrcId() {
		return prcId;
	}
	public void setPrcId(int prcId) {
		this.prcId = prcId;
	}
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public int getWbsid() {
		return wbsid;
	}
	public void setWbsid(int wbsid) {
		this.wbsid = wbsid;
	}
	@Override
	public String toString() {
		return "Employee [prcId=" + prcId + ", empcode=" + empcode + ", wbsid=" + wbsid + "]";
	}
	
}

