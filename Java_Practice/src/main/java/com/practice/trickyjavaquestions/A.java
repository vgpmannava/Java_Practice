package com.practice.trickyjavaquestions;

public class A {

    public static void main(String[] args) {

    //    Integer i = new Integer(null);

    //    String s = new String((String) null);

    //    System.out.println(methodOfA());
        checkIntegerValue();
    }

    static int methodOfA()
    {
        return (true ? null : 0);
    }

    static void checkIntegerValue(){

        Integer i1 = 127;

        Integer i2 = 127;

        System.out.println(i1 == i2);

        Integer i3 = 128;

        Integer i4 = 128;

        System.out.println(i3 == i4);
    }
}
