package com.self.design_patterns;

class SingletoneObj {	
	private final static SingletoneObj obj = new SingletoneObj();
	
	private SingletoneObj() {}
	
	public static SingletoneObj getSingletoneObj() {
		return obj;
	}
}


public class SingletoneMain {
	public static void main(String[] args) {
		SingletoneObj obj1 = SingletoneObj.getSingletoneObj();
		SingletoneObj obj2 = SingletoneObj.getSingletoneObj();
		SingletoneObj obj3 = SingletoneObj.getSingletoneObj();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		
		Singletone s1 = Singletone.get();
		Singletone s2 = Singletone.get();
		Singletone s3 = Singletone.get();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}

class Singletone {
	private static Singletone singletone;
	
	private Singletone() {}
	
	public static Singletone get() {
		return singletone!=null?singletone:(singletone= new Singletone());
	}
}