package com.self.multiThreading;

class Runnable1 implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {Thread.sleep(1000);}catch(Exception e){e.printStackTrace();}
		}
	}
}

class Runnable2 implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);}catch(Exception e){e.printStackTrace();}
		}
	}
}


public class MyRunnable {

	public static void main(String[] args) {
		Runnable r1 = new Runnable1();
		Runnable r2 = new Runnable2();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		try {Thread.sleep(1000);}catch(Exception e){e.printStackTrace();}
		t2.start();
	}

}
