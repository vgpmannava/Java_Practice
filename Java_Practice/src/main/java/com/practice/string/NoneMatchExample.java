package com.practice.string;

import java.util.stream.Stream;

public class NoneMatchExample {

    public static void main(String[] args) {

        System.out.println(noneMatch("HOURLY "));
        System.out.println(noneMatch("Contract "));
    }

    public static boolean noneMatch(String str) {

       return Stream.of("Contract", "Hourly").noneMatch(str.trim()::equalsIgnoreCase);
    }
}
