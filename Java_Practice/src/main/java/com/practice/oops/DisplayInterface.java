package com.practice.oops;

public class DisplayInterface implements  Interface1{

    @Override
    public void display() {

        System.out.println("Displaying from DisplayInterface");
    }

    public void ownDisplay() {
        System.out.println("Displaying from own source");
    }
}
