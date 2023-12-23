package com.check.employee;

class Box<T> {
	private T Obj;

	public T getObj() {
		return Obj;
	}

	public void setObj(T obj) {
		Obj = obj;
	}

	@Override
	public String toString() {
		return "Box [Obj=" + Obj + "]";
	}

}

public class CreatingGenrics {
	public static void main(String[] args) {
		Box<String> strBox = new Box();
		strBox.setObj("Pritam");
		String sbox = strBox.getObj();
		System.out.println(sbox);

		Box<Integer> intBox = new Box();
		intBox.setObj(62);
		int i = intBox.getObj();
		System.out.println(i);
	}
}
