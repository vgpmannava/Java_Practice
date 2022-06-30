package com.practice.string;

import java.util.Arrays;

public class StringLiteralDemo {

    public static void main(String[] args) {

        String s1 = "welcome";
        String s2 = "welcome";
        String s3 = new String("welcome");
        String s4 = "wel";

        System.out.println("Print hashcode of string s1 ..."+s1.hashCode());

        System.out.println("Print hashcode of string s2 ..."+s2.hashCode());

        System.out.println("Print hashcode of string s3 ..."+s3.hashCode());

        System.out.println("S1 == S2 ..."+(s1 == s2));

        System.out.println("S1 == S3 ..."+(s1 == s3));

        System.out.println("S1.compareTo(S4) ..."+s1.compareTo(s4));

        System.out.println(('e' - 's'));

        String text= new String("Hello, My name is Sachin");
        /* Splits the sentence by the delimeter passed as an argument */
        String[] sentences = text.split(",");
        System.out.println(Arrays.toString(sentences));
    }
}
