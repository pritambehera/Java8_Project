package com.interviewbit.java8;

//@FunctionalInterface//opt
interface Foo {

	public default String HelloWorld() {
		return "Hello world";
	}

	public static String CustomeMessage(String message) {
		return message;
	}

	public void bar();
}

public class FooImplementation implements Foo {

	@Override
	public void bar() {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
	}

	@Override
	public String HelloWorld() {
		// TODO Auto-generated method stub
		return "Hello Java 8";
	}

	public static void main(String[] args) {
		FooImplementation fi = new FooImplementation();
		System.out.println(fi.HelloWorld());
		System.out.println(Foo.CustomeMessage("Hello"));
		fi.bar();
	}
}
