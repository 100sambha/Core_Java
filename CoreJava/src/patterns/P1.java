package patterns;

public class P1 {
	public static void main(String[] args) {
//		int size = 5;
//
//		for (int i = 1; i <= size; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			for (int j = i + 1; j <= size; j++) {
//				System.out.print(" ");
//			}
//			for (int j = i + 1; j <= size; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <= size; i++) {
//			for (int j = i; j <= size; j++) {
//				System.out.print("*");
//			}
//			for (int j = 2; j <= i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 2; j <= i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = i; j <= size; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		 for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                if (j - i <= 0 || j + i >= 9) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();	
	        }

	}
}
