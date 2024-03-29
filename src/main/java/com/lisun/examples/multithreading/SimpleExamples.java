package com.lisun.examples.multithreading;

/**
 * @author Alex
 * @since 28.12.2014
 */
public class SimpleExamples {

    static class ThreadInner implements Runnable {
        @Override
        public void run() {

            while (true) {
                for (int i = 10; i > 0; i--) {
                    System.out.printf("Thread: %s " + i + "\n", Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String... args) throws InterruptedException {

        Thread thread1 = new Thread(new ThreadInner());
        Thread thread2 = new Thread(new ThreadInner());



        thread1.start();
        System.out.println(thread1.getName());
        thread2.start();
        System.out.println(thread2.getName());
        thread2.join();

        System.out.println(Thread.currentThread().getName());

    }
}
