package com.practice.multithreading;

public class ThreadExample extends Thread implements Runnable {

	public static void main(String[] args) {

        ThreadExample example = new ThreadExample();
        Thread exThread = new Thread(example); // If implementing runnable this line is necessary where object is passed to Thread

        Thread guruThread1 = new Thread("Guru1");
        Thread guruThread2 = new Thread("Guru2");

        System.out.println("Get state of example..."+example.getState());
        guruThread1.start();
        guruThread2.start();

        exThread.start();

        example.start(); // If extending Thread we can directly call start() on the object
        System.out.println("Get state of example..after start...."+example.getState());

        try {
            Thread.sleep(1500);
            System.out.println("Get state of example..after start...."+example.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        System.out.println("Thread names are following:");
//        System.out.println(guruThread1.getName()+"...Priority..."+guruThread1.getPriority());
//        System.out.println(guruThread2.getName()+"...Priority..."+guruThread2.getPriority());
    }

    public void run(){

        System.out.println("thread is running...");
    }

}
