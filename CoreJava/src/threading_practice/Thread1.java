package threading_practice;

public class Thread1 {
	public static void main(String[] args) {
		
		T1 t1 = new T1();
		t1.start();
		
		T2 t2 = new T2();
		
		t2.start();
		
	}

}



class T1 extends Thread {
	
	public void run() {
		System.out.println("Thread 1 Running..............");		
	}
}

class T2 extends Thread {
	
	public void run() {
		System.out.println("Thread 2 Running..............");		
	}
}