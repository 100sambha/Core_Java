package com.hefshine.patterns;

public class P7 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j-i<=0) {
					System.out.print(i-j+1+" ");
				}
			}
			System.out.println();
		}
	}

}

//1 
//2 1 
//3 2 1 
//4 3 2 1 
//5 4 3 2 1 