package multiThreading;

/*
 * 
 * Teluska
 * 
 */
public class MyThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.start();
		t1.sleep(10);
		t2.start();
		t2.sleep(10);
		
	}
}

class MyThread1 extends Thread{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i+1+" ");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

class MyThread2 extends Thread{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i+1+" ");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}