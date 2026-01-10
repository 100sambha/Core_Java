package com.self.string;

class A {
	void m1(String s) {
		System.out.println("String V");
	}
	
	void m1(Object o) {
		System.out.println("Obj V");
	}
	
	void m1(StringBuffer o) {
		System.out.println("StringBuffer V");
	}
}

public class Overriloading {
	
	public static void main(String[] args) {
		A a = new A();
		a.m1("test");
//		a.m1(null);
		a.m1(new StringBuffer());
	}
}
