package com.practice.java8;

@FunctionalInterface
public interface FunctionalInterface2 extends FunctionalInterface1{

    // Cannot add a single abstract method in this interface as it is already extending another functional interface
    // public String displayFrom2();

    // But this interface can have default methods and static methods
    default void showingFromInterface2(){
        System.out.println("Showing from interface 2");
    }

    default void showingFromInterface2Method2(){
        System.out.println("Showing from interface 2 Method2");
    }

    // This method also exists in Functional Interface 1
    default void show(){
        System.out.println("Showing content from functionalInterface2");
    }

    static void itIsAStaticMethod(){
        System.out.println("It is a static method from FunctionalInterface2");
    }

    static void itIsAStaticMethod2(){
        System.out.println("It is a static method from FunctionalInterface2 Method2");
    }
}
