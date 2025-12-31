package com.hefshine.patterns;

public class P14 {
	public static void main(String[] args) {
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 7; j++) {
				if(j-i<=0 && j+i< 13) {
					System.out.print(j+1 +" ");
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
//1 2 3 4 5 6 
//1 2 3 4 5 6 7 
//1 2 3 4 5 6 
//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1 
