package com.self.multiThreading;

class BufferThread extends Thread {
    StringBuffer sb;

    BufferThread(StringBuffer sb) {
        this.sb = sb;
    }

    
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            sb.append(i);
        }
        System.out.println(Thread.currentThread().getName() + " : " + sb);
    }
}

class BuilderThread extends Thread {
    StringBuilder sb;

    BuilderThread(StringBuilder sb) {
        this.sb = sb;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sb.append(i);
        }
        System.out.println(Thread.currentThread().getName() + " : " + sb);
    }
}

public class ASDFG {
    public static void main(String[] args) {
        // Using StringBuffer (Thread-safe)
        StringBuffer sbf = new StringBuffer("A");
        new BufferThread(sbf).start();
        new BufferThread(sbf).start();

        // Using StringBuilder (Not Thread-safe)
        StringBuilder sbd = new StringBuilder("B");
        new BuilderThread(sbd).start();
        new BuilderThread(sbd).start();
    }
}
