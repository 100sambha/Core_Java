package com.hefshine.patterns;

public class P5 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j-i<=0) {
					System.out.print(j+1+" ");
				}
			}
			System.out.println();
		}
	}

}

//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 