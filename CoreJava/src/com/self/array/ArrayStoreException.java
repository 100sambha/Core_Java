package com.self.array;

import java.util.Arrays;

public class ArrayStoreException {
	public static void main(String[] args) {
		
//		int test[] = new int[-2];

		
		int test[] = new int[2];
		test[0] = 100;
//		test[1] = "Test";
		
		
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 1;

		int b[] = new int[10];
		b[0] = 2;
		b[1] = 2;
		b[2] = 2;
		b[3] = 2;
		b[4] = 2;

		
		System.out.println(a);
		System.out.println(b);
//		a=b;
		b=a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(a.length);
		System.out.println(b.length);
		
//		a[1] = "num";			//	ArrayStoreException
	}
}
