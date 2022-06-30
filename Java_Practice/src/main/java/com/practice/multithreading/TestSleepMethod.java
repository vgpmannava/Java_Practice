package com.practice.multithreading;

public class TestSleepMethod extends Thread{

    public static void main(String[] args) {
        TestSleepMethod sleepMethod1 = new TestSleepMethod();
        TestSleepMethod sleepMethod2 = new TestSleepMethod();

        sleepMethod1.start();

        try {
            sleepMethod1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        sleepMethod2.start();
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++){

            try {
                Thread.sleep(500);
                System.out.println(" Value printing by "+Thread.currentThread().getName()+"...value is...."+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
