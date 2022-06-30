package com.practice.codingbat.string3;

// Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

//maxBlock("hoopla") → 2
//maxBlock("abbCCCddBBBxx") → 3
//maxBlock("") → 0

public class MaxBlock {

    public int maxBlock(String str) {

        int maxCount = 1;
        int resultCount = 0;

        if(str.length() > 0){

            for(int i=0; i<str.length() - 1; i++){

                if(str.charAt(i) == str.charAt(i+1)){

                    maxCount++;
                } else {

                    maxCount = 1;
                }

                if(maxCount > resultCount){
                    resultCount = maxCount;
                }
            }
        }
        return resultCount;
    }
}
