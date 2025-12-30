package com.self.functionalIterface;

public class SquareOfElement {
	public static void main(String[] args) {
		SquareFinder sq = (num)->num*num;
		
		System.out.println(sq.square(10));
	}
}


@FunctionalInterface
interface SquareFinder {
	public int square(int num);
//	public int sum();				function interface can have only one abstract methods
}