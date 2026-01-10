package com.self.multiThreading;

public class VirtualThread {
	public static void main(String[] args) {
		Thread.startVirtualThread(()->{System.out.println("Virtual Thread");});
	}

}
