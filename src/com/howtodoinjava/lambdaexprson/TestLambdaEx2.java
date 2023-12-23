package com.howtodoinjava.lambdaexprson;

/**
 * Using lambda expression to create and start a Thread in Java
 */
public class TestLambdaEx2 {
	public static void main(String[] args) {
		new Thread(() -> System.out.println("New Thread")).start();
//		Emp e = new Emp();
//		new Thread(() -> System.out.println(e.toString())).start();

	}

}

//class Emp{
//	public Emp() {
//		System.out.println("Hello");// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public String toString() {
//		return "Emp []";
//	}
//}