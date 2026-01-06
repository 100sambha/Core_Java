package com.hefshine.array;

import java.util.stream.IntStream;

public class UniquePairs {
	public static void main(String[] args) {
		int num[] = {1,1,2};
		num = IntStream.of(num).distinct().toArray();
		
		int pair_count  = num.length*num.length; 
		System.out.println("Pair Count : "+pair_count);
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.print("("+num[i]+","+num[j]+")");
				if(j<num.length-1)System.out.print(",");
			}
			if(i<num.length-1)System.out.print(",");
		}
		
	}
}
