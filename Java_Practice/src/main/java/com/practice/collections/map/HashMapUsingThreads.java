package com.practice.collections.map;

import com.practice.multithreading.ThreadExample;

import java.util.HashMap;

public class HashMapUsingThreads implements Runnable{

    static HashMap<String, Integer> scores = new HashMap<>();

    public static void main(String[] args) {

        HashMapUsingThreads example = new HashMapUsingThreads();
        Thread t1 = new Thread(example);

        Thread t2 = new Thread(example);

        t1.start();
        t2.start();

        scores.entrySet().stream().forEach((entry) -> System.out.println(entry));
    }

    @Override
    public void run() {
        scores.put("Abc", 12);
        scores.put("Def", 14);
        scores.put("ghi", 18);
    }
}
