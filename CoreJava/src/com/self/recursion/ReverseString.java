package com.self.recursion;

public class ReverseString {
	public static void main(String[] args) {
			String str = "Hello";
			str = reverse(str, "", str.length()-1);
			System.out.println(str);
	}

	private static String reverse(String str, String res,int len) {
		if(len>=0) {
			res = res.concat(str.charAt(len)+"");
			len--;
			return reverse(str, res, len);
		}
		return res;
	}
}