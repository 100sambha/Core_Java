package multiThreading;

class Resource {
    // Simulated resource
}

public class DeadLockCondition {
    Resource resource1 = new Resource();
    Resource resource2 = new Resource();

    class ThreadA extends Thread {
        public void run() {
            synchronized (resource1) { // Acquire Resource 1
                System.out.println("Thread A: Holding Resource 1...");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (resource2) { // Try to acquire Resource 2
                    System.out.println("Thread A: Acquired Resource 2!");
                }
            }
        }
    }

    class ThreadB extends Thread {
        public void run() {
            synchronized (resource2) { // Acquire Resource 2
                System.out.println("Thread B: Holding Resource 2...");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (resource1) { // Try to acquire Resource 1
                    System.out.println("Thread B: Acquired Resource 1!");
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLockCondition de = new DeadLockCondition();
        ThreadA a = de.new ThreadA();
        ThreadB b = de.new ThreadB();
        
        a.start();
        b.start();
        
        System.out.println("Hi");
    }
}
