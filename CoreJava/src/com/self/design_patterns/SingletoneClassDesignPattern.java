package com.self.design_patterns;

public class SingletoneClassDesignPattern {
	public static void main(String[] args) {
		SingletoneClass s1 = SingletoneClass.getBean();
		System.out.println(s1);
		SingletoneClass s2 = SingletoneClass.getBean();
		System.out.println(s2);
		SingletoneClass s3 = SingletoneClass.getBean();
		System.out.println(s3);
		SingletoneClass s4 = SingletoneClass.getBean();
		System.out.println(s4);
		SingletoneClass s5 = SingletoneClass.getBean();
		System.out.println(s5);
	}
}