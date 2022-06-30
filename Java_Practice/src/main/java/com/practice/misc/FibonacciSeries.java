package com.practice.misc;

// 0, 1, 1, 2, 3, 5, 8, 13, 21.....
public class FibonacciSeries {

    public static void main(String[] args) {

       int num1 = 0, num2 = 1,  limit = 10, i = 0;

        System.out.println("Fibonacci Series till " + limit + " terms:");

        while (i < limit){

           System.out.print(num1 + ", ");

           int num3 = num1 + num2;
           num1 = num2;
           num2 = num3;
           i++;
       }
    }
}
