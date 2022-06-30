package com.practice.arrays;

import java.util.Arrays;

public class SortIntArray {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 8, 25, 22, 30,  3, 4, 15, 34};
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){

                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Printing the array after sorting
        Arrays.stream(arr).forEach((eachnum) -> System.out.println(eachnum));

        int currentvalue = arr[0];
        for(int i=1; i< arr.length; i++){

            if(currentvalue == arr[i]){
                System.out.println("first repeated value: "+currentvalue);
                break;
            } else {
                currentvalue = arr[i];
            }
        }

        // OR
        for(int i=0; i< arr.length-1; i++){

            if(arr[i] == arr[i + 1]){
                System.out.println("first repeated value: "+arr[i]);
                break;
            }
        }
    }
}
