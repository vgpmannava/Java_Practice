package com.practice.misc;

import java.util.Scanner;

public class MutlplicationTable {

    public static void main(String[] args) {

        System.out.println("Enter the number for multiplication...");

        Scanner in = new Scanner(System.in);

        String n = in.nextLine();

        System.out.println("Enter limit...");

        in = new Scanner(System.in);

        String limit = in.nextLine();

        multiplicationTable(Integer.parseInt(n), Integer.parseInt(limit));

    }

    public static void multiplicationTable(int n, int limit){

        for(int i=1; i <= limit; i++){

            System.out.println(n +" * "+ i + " = "+ (n*i));
        }
    }
}
