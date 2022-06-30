package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToList {

    public static void main(String[] args) {

        String[] names = {"Arun", "Rahul", "Mahi", "David"};

     //   names = new String[]{"abc", "def", "ghi"};

        // Arrays to List
        List<String> nameList  = Arrays.stream(names).collect(Collectors.toList());

        nameList.stream().forEach((name) -> System.out.println(name));

        // List to Array
        String[] namearray = nameList.stream().toArray(String[]::new);

    }
}
