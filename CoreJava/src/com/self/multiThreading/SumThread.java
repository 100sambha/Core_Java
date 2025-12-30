package com.self.multiThreading;

public class SumThread {
	public static void main(String[] args) {
		
//		By Extending Thread Class
		Thread01 thread01 = new Thread01();			//1
		Thread01 thread02 = new Thread01();			//1
		Thread01 thread03 = new Thread01();			//1
		Thread01 thread04 = new Thread01();			//1
		Thread01 thread05 = new Thread01();			//1
		thread01.start();
		thread02.start();
		thread03.start();
		thread04.start();
		thread05.start();
		
//		By implements Runnable interface
		Thread02 thread2 = new Thread02();
		Thread t1 = new Thread(thread2);
		
		Thread t2 = new Thread(new Thread02());
		Thread t3 = new Thread(new Thread02());
		Thread t4 = new Thread(new Thread02());
		Thread t5 = new Thread(new Thread02());
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
	
}


class Thread01 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}

class Thread02 implements Runnable {
	
	public  void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
	
}