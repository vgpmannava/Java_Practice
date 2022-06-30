package com.practice.string;

import javax.management.MBeanAttributeInfo;
import java.util.Locale;

public class StringPoolTest {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        System.out.println("a object value...."+a.hashCode()+"...b object value...."+b.hashCode());

        a = a.toUpperCase();

        System.out.println("a object value...."+a.hashCode()+"...b object value...."+b.hashCode());
    }
}
