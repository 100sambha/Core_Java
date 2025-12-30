package com.self.multiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter1 extends Thread {
	
//	volatile static int count = 0;
	
	static AtomicInteger count = new AtomicInteger(0);
	
	public void run() {
		for (int i = 0; i < 100; i++) {
//			count++;
			count.incrementAndGet();
		}
	}
	
	public static void main(String[] args) {
		
		Counter1 c1 = new Counter1();
		c1.start();
		Counter1 c2 = new Counter1();
		c2.start();
		Counter1 c3 = new Counter1();
		c3.start();
		Counter1 c4 = new Counter1();
		c4.start();
		Counter1 c5 = new Counter1();
		c5.start();
		
		
		try {
			c1.join();
			c2.join();
			c3.join();
			c4.join();
			c5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(count);
		
	}
}
