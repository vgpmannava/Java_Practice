package com.practice.misc;


public class JavaQuiz {

    public static void main(String[] args) {

        int []a= {1,2,3,4,5,6};
        int i= a.length - 1;

        while(i>=0){
            System.out.println(a[i]);
            i--;
        }

        System.out.println(a instanceof Object);

        int c[] = {1, 2, 053, 4};
        int b[][] = {{1,2,4}, {2,2,1},{0,43,2}};
        System.out.println(a[3] == b[0][2]);
        System.out.println(" " +(a[2] == b[2][1]));

        int d[][] = new int[3][];
        d[0] = new int[]{7,8,9};
        d[1] = new int[]{1,2,3};
        d[2] = new int[]{4,5};

        System.out.println(d[1][1]);

    }

}
