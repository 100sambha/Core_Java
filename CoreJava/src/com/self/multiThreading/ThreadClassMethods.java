package com.self.multiThreading;

public class ThreadClassMethods {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println("Hii");
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getPriority());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}/*,Hii Thread*/);
		
		Thread t2 = new Thread(()->System.out.println("t2 Test"),"t2 Test T2");
		
		t1.start();
		t2.start();
		
		System.out.println(t2.isAlive());
		System.out.println(t1.isAlive());

		
		System.out.println(t1.getName());
		System.out.println(t2.getName());

		t1.setName("Hii Thread T1");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());		
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		t2.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
	}
}