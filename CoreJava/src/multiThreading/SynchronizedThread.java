package multiThreading;

import java.util.stream.IntStream;

public class SynchronizedThread {
	public static void main(String[] args) throws InterruptedException {
		
		CounterClass c = new CounterClass();

		Thread t1 = new Thread(()->{IntStream.rangeClosed(1, 1000).forEach((i)->{c.counter();});});		
		Thread t2 = new Thread(()->{IntStream.rangeClosed(1, 1000).forEach((i)->c.counter());});
		
		t1.start();
		t2.start();
//		t1.run();
		
		
		t1.join();
		t2.join();
		System.out.println(c.count);
	}
}

class CounterClass{
	
	int  count;
	
	public synchronized void counter(){
		count++;
	}
}