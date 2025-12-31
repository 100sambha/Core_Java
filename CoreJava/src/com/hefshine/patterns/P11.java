package com.hefshine.patterns;

public class P11 {
	public static void main(String[] args) {
		for (int i = 0; i < 18; i++) {
			for (int j = 0; j < 9; j++) {
				if(j-i<=0 && j+i<17 && i%2==0) {
					System.out.print("*");
				}
			}
			if(i%2==0) {
				System.out.println();
			}
		}
	}
}

//*
//***
//*****
//*******
//*********
//*******
//*****
//***
//*
