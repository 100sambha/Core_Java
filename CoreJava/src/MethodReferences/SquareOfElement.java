package MethodReferences;

public class SquareOfElement {
	public static void main(String[] args) {
		SquareFinder sq = (num)->num*num;
		
		System.out.println(sq.square(10));
	}
}