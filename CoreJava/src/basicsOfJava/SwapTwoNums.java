package basicsOfJava;

public class SwapTwoNums {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 0;
		System.out.println("Without Using Two Nums");
		System.out.println("Before A : "+a);
		System.out.println("Before B : "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("After A : "+a);
		System.out.println("After B : "+b);
		System.out.println("\nUsing Two Nums");
		int x = 100;
		int y = 200;
		System.out.println("After X : "+x);
		System.out.println("After Y : "+y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After X : "+x);
		System.out.println("After Y : "+y);
		
	}
}