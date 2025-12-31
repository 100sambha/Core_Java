package com.hefshine.patterns;

public class P3 {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			int c = 65;
			for (int j = 0; j < 15; j++) {
				if(7>j && j+i<7) {					
					System.out.print((char)(c++));
				} else if(6<j && j-i>6) {
					System.out.print((char)(c--));					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


//  0	1	2	3	4	5	6	7	8	9	10	11	12	13	14
//0	A	B	C	D	E	F	G	H	G	F	E	D	C	B	A
//1	A	B	C	D	E	F	G		G	F	E	D	C	B	A
//2	A	B	C	D	E	F				F	E	D	C	B	A
//3	A	B	C	D	E						E	D	C	B	A
//4	A	B	C	D								D	C	B	A
//5	A	B	C										C	B	A
//6	A	B												B	A
//7	A														A
