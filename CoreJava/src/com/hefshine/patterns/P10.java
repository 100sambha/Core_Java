package com.hefshine.patterns;

public class P10 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int cnt = 1;
			for (int j = 0; j < 5; j++) {
				if (j - i <= 0) {
					if (i % 2 == 0) {
						if (cnt == 1)
							System.out.print(cnt-- + " ");
						else
							System.out.print(cnt++ + " ");
					} else {
						if (cnt == 1)
							System.out.print(--cnt + " ");
						else
							System.out.print(++cnt + " ");
					}
				}
			}
			System.out.println();
		}
	}
}


//1 
//0 1 
//1 0 1 
//0 1 0 1 
//1 0 1 0 1 
