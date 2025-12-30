package com.self.string;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		String s1 = "1 22 333 4444 55555";
		
		String revString = "";
		for (int i = s1.length()-1; i >= 0; i--) {
			if(s1.charAt(i)!=' ') {
				revString+=s1.charAt(i);
			}
		}
		System.out.println(revString);
		
		String[] s1Array = s1.split(" ");
		
		int[] s1ArrayCountpos = new int[s1Array.length];
		
		for (int i = 0; i < s1ArrayCountpos.length; i++) {
			s1ArrayCountpos[i] = s1Array[i].length();
		}
		System.out.println(Arrays.toString(s1ArrayCountpos));
		
		StringBuilder s = new StringBuilder(revString);
		s.append(' ');

		
		String a1 = "act";
		String a2 = "Cat";
		char[] copyA1 = a1.replaceAll("\\s","").toLowerCase().toCharArray();
		char[] copyA2 = a2.replaceAll("\\s","").toLowerCase().toCharArray();
		Arrays.sort(copyA1);
		Arrays.sort(copyA2);
		System.out.println(Arrays.equals(copyA1, copyA2)?"Angram":"Not Anagram");
	}
}
