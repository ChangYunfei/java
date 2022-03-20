package com.thread;

public class OneThread extends Thread {
    public static void main(String[] args) {

        OneThread t1 = new OneThread();
        t1.start();

        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName() + "\t" + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + i);
        }
    }
}
