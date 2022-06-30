package com.practice.collections.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExampleUsingThreads {

    public static void main(String[] args) {

        HashMap<String, Integer> scores = new HashMap<>();
        ConcurrentHashMap<String, Integer> concurrentScores = new ConcurrentHashMap<>();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (concurrentScores) {
                    concurrentScores.put("Ravi-CSK", 10);
                    concurrentScores.put("Mahi-CSK", 30);
                    concurrentScores.put("Ruturaj-CSK", 98);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (concurrentScores) {
                    concurrentScores.put("Rahul-LSG", 30);
                    concurrentScores.put("Quinton-LSG", 8);
                    concurrentScores.put("Manish-LSG", 4);
                    concurrentScores.put("Ruturaj-CSK", 9);
                    concurrentScores.remove("Ravi-CSK");
                }
            }
        });


        t1.start();
        t2.start();
       concurrentScores.forEach((k,v) -> System.out.println(k +"...."+v));
    //    concurrentScores.entrySet().stream().forEach((entry) -> System.out.println(entry));

       List<Map.Entry<String, Integer>> scoresList = new ArrayList<>(concurrentScores.entrySet());

        ConcurrentHashMap<String, Integer> newConcurrentMap = new ConcurrentHashMap<>();

        scores.put("abc", 123);
        scores.put("def", 456);
        scores.putIfAbsent("abc",789);

        Collections.sort(scoresList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue() - o2.getValue());
            }
        });

        scoresList.stream().forEach((entry) -> System.out.println("List values "+entry));

    }
}
