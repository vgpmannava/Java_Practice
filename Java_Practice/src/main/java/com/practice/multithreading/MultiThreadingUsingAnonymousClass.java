package com.practice.multithreading;

// Example of multi threading using anonymous class
// First way is to use the Thread anonymous class
// Second is to use the Runnable interface
public class MultiThreadingUsingAnonymousClass {

    public static void main(String[] args) {

        // Using Thread Class
        Thread thread = new Thread(){

            @Override
            public void run() {
                super.run();
                System.out.println("Task running");
            }
        };

        thread.start();

        // Using Runnable Interface
        Runnable t2 = new Runnable() {

            @Override
            public void run() {
                System.out.println("Task running in runnable run()...");
            }
        };

        thread=new Thread(t2);
        thread.start();
    }
}
