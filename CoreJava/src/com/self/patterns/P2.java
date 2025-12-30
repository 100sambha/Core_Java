package com.self.patterns;

public class P2 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(j-i>=0) {
					if(i>3 || j>=4) {
						System.out.print(9-j);
					}else {
						System.out.print(6+j);
					}
				}
			}
			System.out.println();
		}
	}
}