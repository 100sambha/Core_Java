package com.hefshine.patterns;

public class P13 {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			cnt = i/2+1;
			for (int j = 0; j < 8; j++) {
				if(j-i<=0) {
					if(i%2==0) {
						if(i/2>j)
							System.out.print(cnt-- +" ");
						else {
							System.out.print(cnt++ +" ");
						}
					}
				}
			}
			if(i%2==0) {
				System.out.println();
			}
		}
	}
}



//1 
//2 1 2 
//3 2 1 2 3 
//4 3 2 1 2 3 4 
