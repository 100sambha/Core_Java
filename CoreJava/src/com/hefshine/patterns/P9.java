package com.hefshine.patterns;

public class P9 {
	public static void main(String[] args) {
		int cnt = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(cnt==1)
					System.out.print(cnt-- + " ");
				else
					System.out.print(cnt++ +" ");
			}
			System.out.println();
		}
	}
}

//1 0 1 0 1 
//0 1 0 1 0 
//1 0 1 0 1 
//0 1 0 1 0 
//1 0 1 0 1 