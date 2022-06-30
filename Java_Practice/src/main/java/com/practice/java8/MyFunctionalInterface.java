package com.practice.java8;

public class MyFunctionalInterface implements FunctionalInterface2, FunctionalInterface3{
    @Override
    public String display(String input) {
        return null;
    }

    public static void main(String[] args) {

        FunctionalInterface1 fn2 = new MyFunctionalInterface();
        fn2.show();

    }

    // This is a diamond problem. Because show() exists in both FunctionalInterface2 and FunctionalInterface3
    // This will force to implement the method and we need to choose which Functional interface's method to use in this method
    // For example inside the below show() we can do FunctionalInterface2.super.show() or FunctionalInterface3.super.show()
    @Override
    public void show() {
        FunctionalInterface3.super.show();
    }
}
