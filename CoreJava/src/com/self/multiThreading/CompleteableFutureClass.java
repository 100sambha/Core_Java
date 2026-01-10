package com.self.multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompleteableFutureClass {
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newSingleThreadExecutor();
//		
		Callable<Integer> mul = ()->{return 10*10;};
//		
//		Future<Integer> pool = service.submit(mul);
//		
//		try {
//			System.out.println(pool.get());
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		CompletableFuture<Void> future = CompletableFuture.runAsync(()->{System.out.println("Test");});
		
		CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(()->10).thenApply((i)->i*20);
		
		CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(()->{return 100;});
		
		CompletableFuture<Integer> f3 = f1.thenCombine(f2, Integer::sum);
		
		
		CompletableFuture<Void> f4 = CompletableFuture.allOf(
				CompletableFuture.runAsync(()->System.out.println("Hello from f4")),
				CompletableFuture.supplyAsync(()->5).thenApply((i)->i*5)
				);
		f4.join();
		

		
		CompletableFuture<Void> f5 = CompletableFuture.runAsync(()->System.out.println(10/2))
				.exceptionally(ex->{
					System.out.println(ex.getMessage());
					return null;
				});
		
		
		
		try {
//			future.get();
//			System.out.println(f1.get());
//			System.out.println(f3.get());
//			System.out.println(f4.get());
			f5.get();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
