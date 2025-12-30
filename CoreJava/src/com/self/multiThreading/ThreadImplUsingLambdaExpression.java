package com.self.multiThreading;

import java.util.stream.IntStream;

public class ThreadImplUsingLambdaExpression {
	public static void main(String[] args) {
//		Runnable r1 = new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 0; i < 5; i++) {
//					System.out.println("Hi");
//					try {Thread.sleep(1000);}catch(InterruptedException e) {e.printStackTrace();}
//				}
//			}
//		};

//		Runnable r1 = ()-> {
//				for (int i = 0; i < 5; i++) {
//					System.out.println("Hi");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			};

//		Runnable r1 = () -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println("Hi");
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		};
//
//		Runnable r2 = () -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println("Hello");
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		};

//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r2);

//		Thread t1 = new Thread(() -> {for (int i = 0; i < 5; i++) {
//				System.out.println("Hi");
//				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
//			}
//		});

		Thread t1 = new Thread(() -> IntStream.range(0, 5).forEach((i) -> {
			try {
				System.out.println("Hi");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}));
//		{
//			for (int i = 0; i < 5; i++) {
//				System.out.println("Hi");
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}

}