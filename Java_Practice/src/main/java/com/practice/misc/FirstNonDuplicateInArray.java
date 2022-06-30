package com.practice.misc;

public class FirstNonDuplicateInArray {

    public static void main(String[] args) {

        char[] a = {'a', 'b', 'c', 'a', 'd', 'd', 'b'};
        boolean duplicateFound = false;

        for(int i=0; i< a.length; i++){

            for(int j= i + 1; j<a.length; j++){

                if(a[i] == a[j]){
                    duplicateFound = true;
                }
            }

            if(!duplicateFound){
                System.out.println("First non repeating value is: "+a[i]);
                break;
            } else {
                duplicateFound = false;
            }
        }
    }
}
