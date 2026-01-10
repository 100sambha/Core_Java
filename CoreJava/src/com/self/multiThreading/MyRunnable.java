package com.self.multiThreading;

public class MyRunnable {
	public static void main(String[] args) {
		
		Counter1 counter1 = new Counter1();
		Counter2 counter2 = new Counter2();
		
		Thread t1 = new Thread(new Runnable1(counter1),"t0");		
		Thread t2 = new Thread(new Runnable2(counter2),"t1");
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
	}
}

class Resource1{}
class Resource2{}

class Counter1 {
	private Resource1 resource1 = new Resource1();
	private Resource2 resource2 = new Resource2();
	int c;
	
	public synchronized void counter1() {
		synchronized (resource1) {
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (resource2) {
				this.c++;
			}
		}
	}
	
	public int getCount() {
		return this.c;
	}
}

class Counter2 {
	
	private Resource1 resource1 = new Resource1();
	private Resource2 resource2 = new Resource2();
	int c;
	
	public synchronized void counter2() {
		synchronized (resource2) {
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (resource1) {
				this.c++;
			}
		}
		
	}
	
	public int getCount() {
		return this.c;
	}
}


class Runnable1 implements Runnable {
	
	Counter1 c;
	
	public Runnable1(Counter1 c) {
		this.c = c;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			c.counter1();
//			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

class Runnable2 implements Runnable {
	
	Counter2 c;
	
	public Runnable2(Counter2 c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			c.counter2();
//			System.out.println(Thread.currentThread().getName()+" "+i);			
		}
	}
}