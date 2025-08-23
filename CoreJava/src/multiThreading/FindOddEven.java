package multiThreading;

public class FindOddEven {
	public static void main(String[] args) {
		int arr [] = {1,2,2,2,5,6,7,8,9,10};
		
		OddEvenFinder finder = new OddEvenFinder(arr);
		
		Runnable r1 = ()->{
			finder.findOdd();
		};
		
		Runnable r2 = ()->{
			finder.findEven();
		};
		
//		Runnable tr1 = finder::findEven;
//		Runnable tr2 = finder::findOdd;
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		t2.start();
	}

}
class OddEvenFinder {
	
	private int arr[];
	private int index = 0;
	boolean flag = true;
	
	public OddEvenFinder(int arr[]) {
		this.arr = arr;
	}
	
	public synchronized void findEven() {
		while(index<arr.length-1) {
			while(flag) {
				waitForOtherThread();
			}
			if(arr[index]%2==0) {
				System.out.println("Even"+arr[index++]);
			}
			flag = true;
			notify();
		}
		
	}

	public synchronized void findOdd() {
		while(index<arr.length-1) {
			while(!flag) {
				waitForOtherThread();
			}
			if(arr[index]%2!=0) {
				System.out.println("Odd"+arr[index++]);
			}
			flag = false;
			notify();
		}
	}
	
	private void waitForOtherThread() {
		try {
			wait();
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}
	}
}