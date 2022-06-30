package com.practice.multithreading;

import java.io.IOException;

// Runtime class is used to interact with java runtime environment
// Runtime class provides methods to execute a process, invoke GC, get total and free memory etc
// There is only one instance of java.lang.Runtime class is available for one java application
public class RunTimeClassExample {

    public static void main(String[] args) {
        try {
            Runtime runTime = Runtime.getRuntime();
            runTime.exec("notepad");
            Runtime runTime2 = Runtime.getRuntime();
            runTime2.exec("notepad");
           // Runtime.getRuntime().exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}