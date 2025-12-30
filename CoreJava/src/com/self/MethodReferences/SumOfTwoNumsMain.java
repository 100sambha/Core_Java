package com.self.MethodReferences;

public class SumOfTwoNumsMain {
	public static void main(String[] args) {
		
//		Reference Without static method
		SumOfTwoNumsUtility numsUtility = new SumOfTwoNumsUtility();
		SumOfTwoNums sum = numsUtility::sumOfTwoElement;
		System.out.println(sum.sumOfTwoNum(10, 20));
		
		
		
//		Reference With static method
//		SumOfTwoNums sum = SumOfTwoNumsUtility::sumOfUpToElements;
//		System.out.println(sum.sumOfUpToElements(10));
		
		
	}
}

interface SumOfTwoNums {
	int sumOfTwoNum(int a, int b);
	
//	int sumOfUpToElements(int num);
}