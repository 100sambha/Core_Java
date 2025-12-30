package com.self.string;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseInteger {
	
	public static void main(String[] args) {
		int[] intArr = {44,6,8,7,2,6,5,48};
		
		
		IntStream.range(0,intArr.length).forEach(i->System.out.println(intArr[intArr.length-1-i]));
	}

}