package multiThreading;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class DeadlockDetector {
    public static void main(String[] args) {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long[] threadIds = bean.findDeadlockedThreads(); // Detect deadlocked threads
        if (threadIds != null) {
            System.out.println("Deadlock detected!");
        } else {
            System.out.println("No deadlock detected");
        }
    }
}