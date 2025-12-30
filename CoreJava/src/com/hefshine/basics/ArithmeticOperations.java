package com.hefshine.basics;

import java.io.IOException;
import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args) throws IOException {
		System.out.println("Please Enter Name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hello " + name);
		System.out.println("Please Enter Two number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		if (n1 == 0 && n2 == 0) {
			System.out.println("Please Enter Valid Number");
			sc.close();
			return;
		}

		System.out.println("Please Enter Choice");
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
		int choice = sc.nextInt();

//		Java 12, 13, 14 feature;

		String res = switch (choice) {
		case 1 ->"Addition "+(n1 + n2);
		case 2 ->"Subsctraction "+ (n1 - n2);
		case 3 ->"Multiplication " +(n1 * n2);
		case 4 ->"Division "+ (n1 / n2);
		default -> "Invalid Choice";
		};
		System.out.println(res);
		sc.close();
	}
}
