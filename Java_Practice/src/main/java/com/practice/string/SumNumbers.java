package com.practice.string;

//Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
//A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'
//Integer.parseInt(string) converts a string to an int.)
//
//sumNumbers("abc123xyz") → 123
//sumNumbers("aa11b33") → 44
//sumNumbers("7 11") → 18

public class SumNumbers {

    public int sumNumbers(String str) {

        String newStr = "";
        int result = 0;

        if(str.length() > 0){
            char ch;
            for(int i=0; i<str.length(); i++){

                ch = str.charAt(i);

                if(Character.isDigit(ch)){
                    newStr = newStr + ch;
                } else {

                    if(newStr.length() > 0){

                        result = result + Integer.parseInt(newStr);
                    }
                    newStr = "";
                }
            }

            if(newStr.length() > 0){
                result = result + Integer.parseInt(newStr);
            }
        }
        return result;
    }
}
