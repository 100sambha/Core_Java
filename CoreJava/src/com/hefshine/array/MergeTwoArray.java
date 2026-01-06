package com.hefshine.array;

import java.util.Arrays;

public class MergeTwoArray {
	public static void main(String[] args) {
		char ch1[] = {'a','b','c','d'};
		char ch2[] = {'v','w','x','y','z'};
		char ch3[] = new char[ch1.length+ch2.length];
		int len = ch1.length>ch2.length?ch1.length:ch2.length;
		
		int index = 0;
		
		for (int i = 0; i < len; i++) {
			if(ch1.length>i) {
				ch3[index++] = ch1[i];
			}
			if(ch2.length>i) {
				ch3[index++] = ch2[i];
			}
		}
		
		System.out.println(Arrays.toString(ch3));
	}
}