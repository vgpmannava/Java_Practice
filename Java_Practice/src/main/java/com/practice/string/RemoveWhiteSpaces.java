package com.practice.string;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("This is   for removing white space"));

        System.out.println(removeWhiteSpaces("Hello and Welcome "));
    }

    public static String removeWhiteSpaces(String str){

        String newStr = "";
        for(int i=0; i<str.length(); i++){

            if(str.charAt(i) != ' '){
                newStr = newStr + str.charAt(i);
            }
        }

        return newStr;
    }

}
