package practice;

class Ex_Singletone1 {

	private static final Ex_Singletone1 ex_Singletone1 = new Ex_Singletone1();
	
	private Ex_Singletone1() {}

	public static Ex_Singletone1 getInstance() {
		return ex_Singletone1;
	}
}

class Ex_Singletone2 {
	private static Ex_Singletone2 ex_Singletone2;
	
	private Ex_Singletone2() {}
	
	public static Ex_Singletone2 getInstance() {
		if(ex_Singletone2==null) {
			return new Ex_Singletone2();
		}else {
			return ex_Singletone2;
		}
	}
}

class Ex_Singletone3 {
	private static Ex_Singletone3 ex_Singletone3;
	
	private Ex_Singletone3() {}
	
	public static synchronized Ex_Singletone3 getInstance() {
		if(ex_Singletone3==null) {
			return new Ex_Singletone3();
		}
		return ex_Singletone3;
	}
}

enum Ex_Singletone4 {
	INSTANCE;
	
	public void showMessage() {
		System.out.println("Welocme to Pune");
	}
}


public class Ex_Singletone {
	public static void main(String[] args) {
		System.out.println("------------Way1-----------");
		Ex_Singletone1 ex_Singletone1_1 = Ex_Singletone1.getInstance();
		Ex_Singletone1 ex_Singletone1_2 = Ex_Singletone1.getInstance();
		Ex_Singletone1 ex_Singletone1_3 = Ex_Singletone1.getInstance();
		
		System.out.println(ex_Singletone1_1);
		System.out.println(ex_Singletone1_2);
		System.out.println(ex_Singletone1_3);
		
		
		System.out.println("\n------------Way2-----------");
		Ex_Singletone2 ex_Singletone2_1 = Ex_Singletone2.getInstance();
		Ex_Singletone2 ex_Singletone2_2 = Ex_Singletone2.getInstance();
		Ex_Singletone2 ex_Singletone2_3 = Ex_Singletone2.getInstance();
		
		System.out.println(ex_Singletone2_1);
		System.out.println(ex_Singletone2_2);
		System.out.println(ex_Singletone2_3);
		
		
		System.out.println("\n------------Way3-----------");
		Ex_Singletone3 ex_Singletone3_1 = Ex_Singletone3.getInstance();
		Ex_Singletone3 ex_Singletone3_2 = Ex_Singletone3.getInstance();
		Ex_Singletone3 ex_Singletone3_3 = Ex_Singletone3.getInstance();
		
		System.out.println(ex_Singletone3_1);
		System.out.println(ex_Singletone3_2);
		System.out.println(ex_Singletone3_3);

		
		System.out.println("\n------------Way4-----------");
		Ex_Singletone4 ex_Singletone4_1 = Ex_Singletone4.INSTANCE;
		Ex_Singletone4 ex_Singletone4_2 = Ex_Singletone4.INSTANCE;
		Ex_Singletone4 ex_Singletone4_3 = Ex_Singletone4.INSTANCE;
		
		System.out.println(ex_Singletone4_1.hashCode());
		System.out.println(ex_Singletone4_2.hashCode());
		System.out.println(ex_Singletone4_3.hashCode());
	}
}