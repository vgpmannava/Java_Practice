package com.practice.oops;

public class TestDisplayInterface {

    // If new methods are added in DisplayInterface that will not be accessible if you are initializing with Interface1
    // For example here owndisplay() of the DisplayInterface will not be available
    // To access the ownDisplay() of DisplayInterface, you need to initialize with DisplayInterface
    // DisplayInterface display = new DisplayInterface();
    public static void main(String[] args) {
        Interface1 interface1 = new DisplayInterface();
        interface1.display();

    }
}
