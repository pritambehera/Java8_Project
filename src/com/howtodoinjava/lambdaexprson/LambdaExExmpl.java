package com.howtodoinjava.lambdaexprson;

//@FunctionalInterface
interface Operator<T> {
	T process(T a, T b);
}

public class LambdaExExmpl {
	public static void main(String[] args) {
		Operator<Integer> addoperation = (a, b) -> a + b;
		System.out.println(addoperation.process(12, 30));

		Operator<String> appendOp = (a, b) -> a + b;
		System.out.println(appendOp.process("10", "20"));
		
		Operator<Integer> multiOp = (a,b)->a*b;
		System.out.println(multiOp.process(3, 30));
		
	}

}
