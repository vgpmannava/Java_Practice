package com.practice.java8;

@FunctionalInterface
public interface FunctionalInterface1 {

    public String display(String input);

    default void show(){
        System.out.println("Showing content from functionalInterface1");
    }
}
