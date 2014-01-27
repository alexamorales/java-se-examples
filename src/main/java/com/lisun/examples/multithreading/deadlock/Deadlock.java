package com.lisun.examples.multithreading.deadlock;

/**
 * @author Aleksey
 * @since 1/26/14
 */
public class Deadlock {
    static class Friend {
        String name;

        public Friend(String name) {
            this.name = name;
        }

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s"
                    + " has bowed to me!%n",
                    this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend friend) {
            System.out.format("%s: %s"
                    + " has bowed back to me!%n",
                    this.name, friend.getName());
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        final Friend alphonse = new Friend("Alphonce");
        final Friend gatson = new Friend("Gatson");

        new Thread(new Runnable() {
            @Override
            public void run() {
                alphonse.bow(gatson);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                gatson.bow(alphonse);
            }
        }).start();

    }

}
