package java8;

abstract class Test{
	public abstract void test();
}


public class AnnonymousClassEx {
	public static void main(String[] args) {
		Test t = new Test() {
			public void test() {
				System.out.println("I have done morning tea");
			}
		};
		
		t.test();
	}

}
