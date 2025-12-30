package com.self.oops;

class A{
	public void foo() {
		System.out.println("A Foo");
	}
}

class B extends A{
	public void foo() {
		System.out.println("B Foo");
	}
	
	public void bar() {
		System.out.println("B Bar");
	}
}

interface X {
	void foo();
}

interface Y extends X {
	void foo();
	void bar();
}

class Z implements X,Y {
	public void foo() {
		System.out.println("foo From interface");
	}
	
	public void bar() {
		System.out.println("bar From interface");		
	}
}


public class InterviewQuestion3 {
	public static void main(String[] args) {
		A a = new B();
		a.foo();
		
		Y y = new Z(); 
//		a.bar();				//Will give error method bar() is undefined for class A
		
		y.foo();
		y.bar();
	}
}