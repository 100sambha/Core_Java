package exceptionHandling;

public class NullPointerExceptionHandling {
	public static void main(String[] args) throws NullPointerException{
		String str = null;
		System.out.println(str.charAt(1));
//		System.out.println(str.length());
//		throw new NullPointerException();
	}
}
