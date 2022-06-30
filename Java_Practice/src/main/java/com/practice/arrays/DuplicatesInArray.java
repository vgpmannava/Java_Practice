package com.practice.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class DuplicatesInArray {

    public static void main(String[] args) {

        int[] a = new int[]{2, 2, 3, 4, 5, 5, 5, 6, 7};

        int[] duplicates = new int[a.length];
        int index = 0;

        for(int i=0; i<a.length; i++){

            for(int j=i+1; j<a.length; j++){

                if(a[i] == a[j]) {
                    duplicates[index] = a[i];
                    index++;
                    break;
                }
            }
        }

        Arrays.stream(duplicates).forEach((duplicate -> System.out.println(duplicate)));

        findDuplicates(a).entrySet().stream().forEach((entry) -> System.out.println(entry));
    }

    public static HashMap<Integer, Integer> findDuplicates(int[] a){

        HashMap<Integer, Integer> duplicates = new HashMap<>();

        for(int i=0; i<a.length; i++){

            for(int j=i+1; j<a.length; j++){

                if(duplicates.containsKey(a[i])){

                    duplicates.put(a[i], duplicates.get(a[i])+1);
                } else {
                    duplicates.put(a[i], 1);
                }
                break;
            }
        }
        return duplicates;
    }
}
