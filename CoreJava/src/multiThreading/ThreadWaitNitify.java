package multiThreading;

class Q {
	int num;
	boolean valueSet = false;
	
	public synchronized void setNum(int num) {
		while(valueSet) {
			try {wait();} catch (Exception e) {}
		}
		this.num = num;
		System.out.println("Set : "+this.num);
		valueSet = true;
		notify();
	}
	
	public synchronized void getNum() {
		while(!valueSet) {
			try {wait();} catch (Exception e) {}			
		}
		System.out.println("Get : "+this.num);
		valueSet = false;
		notify();
	}
}

class Producer implements Runnable{
	
	Q q;
	
	public Producer(Q q) {
		this.q = q;
		Thread t1 = new Thread(this,"Producer");
		t1.start();
	}
	
	int i = 0;
	public void run() {
		while(true) {
			q.setNum(i++);
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

class Consumer implements Runnable{
	
	Q q;
	
	public Consumer(Q q) {
		this.q = q;
		Thread t2 = new Thread(this, "Consumer");
		t2.start();
	}
	
	public void run() {
		while(true) {
			q.getNum();
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}


public class ThreadWaitNitify {
	public static void main(String[] args) {
		
		Q q = new Q();
		new Consumer(q);
		new Producer(q);
		
		
	}
	
}
