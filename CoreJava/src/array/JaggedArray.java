package array;

import java.util.Arrays;

public class JaggedArray {
	public static void main(String[] args) {
//		also called as ragged array
		
		int a[] = new int[] {1,2,3};
		
		int b[] = new int[5];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		
		int c[] = {100, 200};
		
		int jaggedArray[][] = new int[][]{a,b,c};
//		int jaggedArray[][] = {a,b,c};
		
		System.out.println(Arrays.toString(jaggedArray));
	}

}
