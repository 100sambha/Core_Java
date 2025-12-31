package com.hefshine.patterns;

public class P6 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j - i <= 0) {
					System.out.print(i + 1 +" ");
				}
			}
			System.out.println();
		}
	}
}


//1 
//2 2 
//3 3 3 
//4 4 4 4 
//5 5 5 5 5 