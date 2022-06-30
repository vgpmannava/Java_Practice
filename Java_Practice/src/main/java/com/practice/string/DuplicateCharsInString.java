package com.practice.string;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharsInString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String str = in.nextLine();

        System.out.println("Number of duplicate "+  findDuplicateCharsUsingString(str).length);

        char[] duplicateValues = findDuplicateCharsUsingString(str);
        for(char eachvalue: duplicateValues){
            System.out.print(eachvalue+" ");
        }

    }

    public static  char[] findDuplicateCharsUsingString(String str){

        String newStr = "";

        if(str != null && str.length() > 0){

            for(int i=0; i<str.length(); i++){

                for(int j=0; j<str.length(); j++){

                    if(i != j && str.charAt(i) == str.charAt(j) && !newStr.contains(str.substring(j,j+1))){

                        newStr = newStr + str.substring(j,j+1);
                        break;
                    }
                }
            }
        }

        return newStr.toCharArray();
    }

    public static  char[] findDuplicateCharsUsingMap(String str){

        String newStr = "";

        HashMap<String, Integer> duplicateValues = new HashMap<>();

       // To be implemented

        return newStr.toCharArray();
    }
}
