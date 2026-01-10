package com.self.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WaitNotify {
	public static void main(String[] args) {
		
		SendSignal signal = new SendSignal();
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(()->signal.forWait());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		service.submit(()->signal.ForNotify());
		service.shutdown();
		
	}

}


class SendSignal {
	boolean status = false;
	
	public synchronized void forWait() {
		while(!status) {
			try {
				System.out.println("Signal Transmission Not staretd Yet");
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Signal Received");
		}
	}
	
	public synchronized void ForNotify() {
		status = true;
		notify();
		System.out.println("Signal Sent");
	}
}