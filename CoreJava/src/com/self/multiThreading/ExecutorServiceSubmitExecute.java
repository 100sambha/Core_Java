package com.self.multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceSubmitExecute {
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		Runnable r = ()->System.out.println("Hello, I am from runnable");
		service.execute(r);
		

		Callable<Integer> c = ()-> {return 10*10;};
		Future<Integer> pool = service.submit(c);
		try {
			System.out.println(pool.get());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
