package array;

import java.util.Arrays;

public class ArrayStoreException {
	public static void main(String[] args) {
		
//		int test[] = new int[-2];

		
		int test[] = new int[2];
		test[0] = 100;
//		test[1] = "Test";
		
		
		int a[] = new int[10];
		a[0] = 1;
		a[1] = 1;
		a[2] = 1;
		a[3] = 1;
		a[4] = 1;
		a[5] = 1;
		a[6] = 1;
		a[7] = 1;
		a[8] = 1;
		a[9] = 1;
		int b[] = new int[100];
		b[0] = 2;
		b[1] = 2;
		b[2] = 2;
		b[3] = 2;
		b[4] = 2;
		b[5] = 2;
		b[6] = 2;
		b[7] = 2;
		b[8] = 2;
		b[9] = 2;
		b[10] = 2;
		b[11] = 2;
		b[12] = 2;
		b[13] = 2;
		b[14] = 2;
		b[15] = 2;
		b[16] = 2;
		b[17] = 2;
		b[18] = 2;
		b[19] = 2;
		b[20] = 2;
		b[21] = 2;
		b[22] = 2;
		b[23] = 2;
		b[24] = 2;
		b[25] = 2;
		
		System.out.println(a);
		System.out.println(b);
//		a=b;
		b=a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(a.length);
		System.out.println(b.length);
		
//		a[1] = "num";			//	ArrayStoreException
	}
}
