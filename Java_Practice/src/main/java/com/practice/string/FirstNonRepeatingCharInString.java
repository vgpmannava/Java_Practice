package com.practice.string;

import java.util.Scanner;

public class FirstNonRepeatingCharInString {

    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine();

        System.out.println("First Non Repeating char in "+str+" is: "+firstNonRepeatChar(str));
        
    }

    private static char firstNonRepeatChar(String str) {
        
        boolean duplicateFound = false;

        for(int i=0; i<str.length(); i++){
            
            for(int j= 0; j<str.length(); j++){
        
                if(i != j && str.charAt(i) == str.charAt(j)){
                    
                    duplicateFound = true;
                }
            }
            
            if(!duplicateFound){

                return str.charAt(i);
            } else {
                
                duplicateFound = false;
            }
        }
        
        return ' ';
    }

}
