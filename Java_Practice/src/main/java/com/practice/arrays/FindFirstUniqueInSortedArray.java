package com.practice.arrays;

public class FindFirstUniqueInSortedArray {

    public static void main(String[] args) {

        int[] num = new int[]{3, 3, 4, 4, 4, 5, 6, 7, 7};

        boolean duplicateFound = false;

        for(int i= 0; i< num.length; i++){

           for(int j= 0; j < num.length; j++){

               if(i != j && num[i] == num[j]){
                   duplicateFound = true;
               }
           }

           if(!duplicateFound){
               System.out.println("First unique element: "+num[i]);
               break;
           } else {
               duplicateFound = false;
           }

        }

    }
}
