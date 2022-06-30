package com.practice.java8;

import java.util.*;
import java.util.stream.Collectors;

// Iteration of Map in Java 8
//
public class MapInJava8 {

    public static void main(String[] args) {

        HashMap<String, Integer> scoresMap  = new HashMap<>();
        scoresMap.put("Devon", 40);
        scoresMap.put("Rahul", 100);
        scoresMap.put("Shreyas", 68);
        scoresMap.put("Mayank", 32);

        scoresMap.entrySet().stream().forEach((eachscore) -> System.out.println(eachscore));

        scoresMap.keySet().stream().forEach((eachscore) -> System.out.println(eachscore));

        scoresMap.values().stream().forEach((value) -> System.out.println(value));

        Set<Map.Entry<String, Integer>> scoreset =  scoresMap.entrySet().stream().collect(Collectors.toSet());

        scoresMap.entrySet().stream().sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey())).forEach((score) -> System.out.println("Sorting by name..."+score));

        scoresMap.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())).forEach((score) -> System.out.println("Sorting by Value..."+score));

        scoreset.stream().forEach((score) -> System.out.println("Printing from Set...."+score));

        List<Map.Entry<String, Integer>> scoreList = scoresMap.entrySet().stream().collect(Collectors.toList());

        scoreList.stream().forEach((score) -> System.out.println("Printing from List...."+score));

        scoresMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach((k) -> System.out.println(k));

        scoresMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).forEach((k) -> System.out.println(k));
    }

}
