package com.practice.java8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FindPrimeNumbersBetweenTwoNumbers {

    public static void main(String[] args) {
        System.out.println("Enter a limit for prime numbers...");

        Scanner in = new Scanner(System.in);;

        int maxInt = in.nextInt();

        // Find the Integers that are prime number
      /*  for(int i=2; i<=maxInt; i++){

            if(((i % 2 != 0) && (i % 3 !=0)) || (i == 2 || i == 3)){
                System.out.print(i+",");
            }
        }*/

        IntStream.range(2, maxInt)
                .filter((eachNum) -> ((eachNum % 2 != 0) && (eachNum % 3 !=0)) || (eachNum == 2 || eachNum == 3))
                .forEach((num) -> System.out.println(num));
    }

    private boolean isPrime(int num){

        if(num == 2 || num ==3){
            return true;
        }

        for(int i=2; i<num; i++){

            if(num%i == 0 ){
                return false;
            }
        }
        return true;
    }
}
