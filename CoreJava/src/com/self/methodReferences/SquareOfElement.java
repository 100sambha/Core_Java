package com.self.methodReferences;

public class SquareOfElement {
	public static void main(String[] args) {
		
//		SquareFinder squareFinder = ()->System.out.println(10*10);
		
		SquareFinder sq = SquareOfElement::print;
		System.out.println(sq.square(10));
	}
	
	static int print(int a) {
		return a*a;
	}
}


@FunctionalInterface
interface SquareFinder {
	public int square(int num);
	
//	public int sum();
}
