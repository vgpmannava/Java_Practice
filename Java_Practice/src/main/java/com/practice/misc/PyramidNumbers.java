package com.practice.misc;

import java.util.Scanner;

public class PyramidNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking noOfRows value from the user

        System.out.println("How Many Rows You Want In Your Pyramid?");

        int noOfRows = sc.nextInt();

        //Initializing rowCount with 1
        int rowCount = 1;

        for(int i=noOfRows; i > 0; i--){

            //Printing i spaces at the beginning of each row
            for (int j = 1; j < i; j++) {

                System.out.print(" ");
            }

            //Printing 'rowCount' value 'rowCount' times at the end of each row
            for(int j = 1; j<= rowCount; j++) {

                System.out.print(rowCount+" ");
            }

            System.out.println();

            rowCount++;
        }
    }
}
