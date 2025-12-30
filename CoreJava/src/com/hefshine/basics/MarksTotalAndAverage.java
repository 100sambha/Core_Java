package com.hefshine.basics;

import java.util.Arrays;
import java.util.Scanner;

public class MarksTotalAndAverage {
	public static void main(String[] args) {
		System.out.println("Enter 6 Subjects Marks ");
		Scanner scanner = new Scanner(System.in);
		int []a = new int[6];
		for(int i = 0; i < 6; i++) {
			a[i]=scanner.nextInt();
		}
		
		System.out.println(Arrays.stream(a).sum());
		System.out.println(Arrays.stream(a).average());
		scanner.close();
	}
}
