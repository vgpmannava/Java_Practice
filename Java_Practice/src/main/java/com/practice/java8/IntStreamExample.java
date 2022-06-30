package com.practice.java8;

import java.util.stream.IntStream;

public class IntStreamExample {

    public static void main(String[] args) {

        String a = "Hello";
        String b = new String("Hello");

        System.out.println(a == b);

        System.out.println(a.equals(b));

        int first = 1, last = 10;

        IntStream.range(first, last)
                .filter((num)->num % 2 !=0)
                .forEach((eachNum) -> System.out.println(eachNum));

    }
}
