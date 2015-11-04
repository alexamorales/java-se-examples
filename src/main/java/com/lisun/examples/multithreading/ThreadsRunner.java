package com.lisun.examples.multithreading;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 10/23/13
 * Time: 4:11 PM
 */
class ThreadRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + this.getClass().getName() + "i: " + i);

                throw new RuntimeException();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TestThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println(Thread.currentThread().getName() + " " + this.getClass().getName() + " i: " + i);
        }
    }
}


public class ThreadsRunner {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new ThreadRunnable());
        Thread thread2 = new Thread(new ThreadRunnable());

        thread1.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        thread1.start();
        thread1.join();
        thread2.start();
    }


}





