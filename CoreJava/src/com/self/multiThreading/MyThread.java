package com.self.multiThreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Thread0 extends Thread {

	MyThread myThread = new MyThread();

	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			myThread.counter1();
//			System.out.println("T0 - "+i);
		}
	}
}

class Thread1 extends Thread {

	MyThread myThread = new MyThread();

	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			myThread.counter2();
//			System.out.println("T1 - "+i);
		}
	}
}

public class MyThread {

	static volatile int count;
	static Lock lock1 = new ReentrantLock();
	static Lock lock2 = new ReentrantLock();

//	static AtomicInteger count = new AtomicInteger(0);

	public static void main(String[] args) {
		Thread0 t0 = new Thread0();
		Thread1 t1 = new Thread1();

		try {
			t0.start();
			t1.start();
			t0.join();
			t1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(count);

	}

	public void counter1() {
		lock1.lock();
		try {
			lock2.lock();
			try {
				count++;
//				count.getAndIncrement();
			} finally {
				lock2.unlock();
			}
		} finally {
			lock1.unlock();
		}
	}

	
//											Here if we don't use lock then race condition is coming and output leads wrong
//											Race condition can be solved using lock or synchronizing resource
//											Here If we use commented lock then deadlock is occurring, 
	public void counter2() {

		lock1.lock();						//		lock2.lock();
		try {
			lock2.lock();					//			lock1.lock();
			try {
				count++;
//				count.getAndIncrement();
			} finally {
				lock2.unlock();				//				lock1.unlock();
			}
		} finally {
			lock1.unlock();					//			lock2.unlock();
		}
	}
}