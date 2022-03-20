package com.thread;

public class OneRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"\t"+i);
        }
    }
}

class Test{
    public static void main(String[] args) {
        OneRunnable r1=new OneRunnable();
        Thread t=new Thread(r1);
        t.start();


        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("runnable "+Thread.currentThread().getName()+"\t"+i);
        }
    }


}