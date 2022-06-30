package com.practice.arrays;

// Find All Pairs Of Elements In An Array Whose Sum Is Equal To A Given Number
public class SumEqualPair {

    public static void main(String[] args) {

        int[] nums = {2,3,5,8,9,14,16,4,12,6};
        int resultNum = 20;

        for(int i=0; i< nums.length; i++){

            for(int j= i +1; j< nums.length; j++){

                if((nums[i] + nums[j]) == resultNum){
                    System.out.println("Pair: "+nums[i]+"---"+nums[j]);
                }

            }
        }
    }

}
