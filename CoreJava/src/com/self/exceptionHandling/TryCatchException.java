package com.self.exceptionHandling;

import java.util.Scanner;

public class TryCatchException {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Connection Open");

		try
		{
			int i = 10 / 0;
			System.out.println(i);
			scanner.close();
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
			int c = 10/0;
			System.out.println(c);
			
			scanner.close();
			int b = scanner.nextInt();
			System.out.println(b);
		}
		finally {
			scanner.close();
			System.out.println("Connection Closed");
		}
		int c = scanner.nextInt();
		System.out.println(c);
	}

}
