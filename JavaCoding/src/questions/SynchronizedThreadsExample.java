package questions;

public class SynchronizedThreadsExample {
    private static int counter = 0;
    private static final int TARGET_VALUE = 10000;

    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new IncrementTask(), "Thread 1");
        Thread thread2 = new Thread(new IncrementTask(), "Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + counter);
    }

    static class IncrementTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < TARGET_VALUE; i++) {
                incrementCounter();
            }
        }

        private synchronized void incrementCounter() {
            counter++;
        }
    }
}

