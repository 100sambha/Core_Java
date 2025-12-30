package com.self.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExecutorService {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		
		for (int i = 0; i < 3; i++) {

//			1,2,3,4,5,1,5,2,4,3
			executor.submit(()->{
					for (int j = 0; j < 10; j++) {
						System.out.println(j);
					}
			});
		}
		
		executor.shutdown();
	}

}
