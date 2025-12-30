package com.self.string;

public class StringConvert {

	public static void main(String[] args) {
		String num = "100";
		int inum1 = Integer.valueOf(num);
		int inum2 = Integer.parseInt(num);
		System.out.println(inum1);
		System.out.println(inum2);
		
		
		int val = 200;
		String val1 = Integer.toString(val);
		String val2 = String.valueOf(val);
		System.out.println(val1);
		System.out.println(val2);
	}

}
