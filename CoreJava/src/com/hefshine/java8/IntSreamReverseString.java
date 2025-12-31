package com.hefshine.java8;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntSreamReverseString {
	public static void main(String[] args) {
		System.out.println("Reverse String");
		System.out.print("Enter String : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		System.out.println("Your String : "+str);
		String revStr = IntStream.range(0, str.length()).mapToObj(i->""+str.charAt(str.length()-1-i)).collect(Collectors.joining());
		System.out.println("Reverse String : "+revStr);
	}
}