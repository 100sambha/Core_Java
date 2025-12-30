package com.self.java8;

abstract class Test{
	public abstract void test();
}


public class AnnonymousClassEx {
	public static void main(String[] args) {
		Test t = new Test() {
			public void test() {
				System.out.println("I am from annonymous class");
			}
		};	
		t.test();
		
		
		
		SumClass s = (a, b)-> {return  a+b;};
		System.out.println(s.sum(10, 20));
	}
}


interface SumClass {
	int sum(int a, int b);
}