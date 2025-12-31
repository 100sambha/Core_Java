package com.hefshine.patterns;

public class P15 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			boolean status = true;
			for (int j = 0; j < 9; j++) {
				if(j+i<4 || j-i>4) {					
					System.out.print("-");
				}
				else {
					if(status) {
						System.out.print("*");
						status = false;
					}
					else {
						System.out.print("-");
						status = true;
					}
				}
			}
			System.out.println();
		}
	}
}