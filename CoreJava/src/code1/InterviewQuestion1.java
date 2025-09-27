package code1;

public class InterviewQuestion1 {
	public static void main(String[] args) {
		System.out.println("String Builder");
		StringBuilder builder1 = new StringBuilder("Hello");
		StringBuilder builder2 = new StringBuilder("Hello");
		System.out.println(builder1.hashCode());
		System.out.println(builder2.hashCode());
		System.out.println(builder1 == builder2);				//false
		System.out.println(builder1.equals(builder2));			//false....equals method need to be override

		System.out.println("String Literal");
		String b1 = "Hello";
		String b2 = "Hello";
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1 == b2);							//true
		System.out.println(b1.equals(b2));						//true

		System.out.println("String Builder and String Literal");
		StringBuilder s1 = new StringBuilder("Hello");
		String s2 = "Hello";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
//		System.out.println(s1==s2);								//Compatibitlity error
//		System.out.println(s1.equals(s2));						//false
	}
}
