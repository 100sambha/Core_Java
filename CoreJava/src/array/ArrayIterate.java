package array;

public class ArrayIterate {
	public static void main(String[] args) {
		int a[] = {1,5,9,8,7,4,6,3,2};
		
		System.out.println("Using For Loop");
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		System.out.println("Using For Each");
		for(int num : a) {
			System.out.println(num);
		}
		
		
	}
}
