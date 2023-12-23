package com.createcustomcollections;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CustomArrayListTest {
	public static void main(String[] args) {
		CustomArrayList<Integer> cal = new CustomArrayList<Integer>();
		cal.add(1);
		cal.add(2);
		cal.add(3);
		cal.add(4);
		cal.add(5);
		cal.add(6);
		cal.add(7);
		cal.add(8);
		cal.add(9);
		cal.add(10);
		cal.add(21);
		cal.add(31);
		cal.display();
	}
}

class CustomArrayList<E> {

	private static int size = 0;
	private static int DEFAULT_CAPACITY = 10;
	private Object[] element = {};

	public CustomArrayList() {
		element = new Object[DEFAULT_CAPACITY];
	}

	public void add(E e) {
		if (size == element.length) {
			ensureCapacity();
		}
		element[size++] = e;
	}

	private void ensureCapacity() {
		int newIncreasedCapacity = element.length * 2;
		element = Arrays.copyOf(element, newIncreasedCapacity);
	}
	public void display() {
		for (int i = 0; i <size; i++) {
			System.out.println(element[i]);
			
		}
		
			
		}
	}
