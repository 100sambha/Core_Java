package com.self.leetcodeEasy;

public class Pallindrome {
	public static void main(String[] args) {
		String[] str = { "flower", "flow", "flight" };
//		String[] str = { "dog","racecar","car" };
		System.out.println(longestCommonPrefix(str));

	}

	public static String longestCommonPrefix(String[] strs) {
		
		String small = "";
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			if(min>strs[i].length()) {
				min = strs[i].length();
				small = strs[i];
			}
		}
		
		
		String pref = "";
		String temp = "";
		for (int i = 0; i < small.length(); i++) {
			temp = temp.concat(small.charAt(i)+"");
			boolean status = true;
			for (int j = 0; j < strs.length; j++) {
				if(!strs[j].contains(temp)) {
					status = false;
					break;
				}
			}
			if(status) {
				pref = pref.concat(small.charAt(i)+"");
				temp = pref;
			}else {
				break;
			}
		}
		
		return pref;
	}
}