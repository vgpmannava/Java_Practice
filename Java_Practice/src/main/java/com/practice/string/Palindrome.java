package com.practice.string;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("aabaa"));
        System.out.println(isPalindrome("madam"));

        System.out.println(isPalindrome("Hello"));

    }

    public static boolean isPalindrome(String str){

        String newStr = "";
        char ch;

        for(int i=0; i<str.length(); i++){

            ch = str.charAt(i);
            newStr = ch + newStr;
        }

        return (str.equals(newStr));
    }
}
