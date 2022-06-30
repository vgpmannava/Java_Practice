package com.practice.arrays;

public class SecondLargestNumInArray {

    public static void main(String[] args) {

        int[] numbers = new int[]{21, 2, 32, 8, 18, 4, 5, 12, 21};

        int firstMax = 0;
        int secondMax = 0;

        if(numbers[0] > numbers[1]){
            firstMax = numbers[0];
            secondMax = numbers[1];
        } else {
            firstMax = numbers[1];
            secondMax = numbers[0];
        }

        for(int i=2; i<numbers.length; i++){

            if(numbers[i] > firstMax){

                secondMax = firstMax;
                firstMax = numbers[i];
            } else if(numbers[i] > secondMax){

                secondMax = numbers[i];
            }
        }

        System.out.println("Max number is..."+firstMax+" Second max number is..."+secondMax);
    }
}
