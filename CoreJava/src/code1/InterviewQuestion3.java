package code1;

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


public class InterviewQuestion3 {
	public static void main(String[] args) {
		A a = new B();
		a.foo();
//		a.bar();				//Will give error method bar() is undefined for class A
	}
}
