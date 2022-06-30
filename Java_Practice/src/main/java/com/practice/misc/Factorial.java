package com.practice.misc;

// n! = n * n -1 * n - 2 * ....
public class Factorial {

    public static void main(String[] args) {

        int i = 1, n = 5, result = 1;

        while(i <= n){

            result = result * (i);
            i++;
        }

        System.out.println(result);

    }
}
