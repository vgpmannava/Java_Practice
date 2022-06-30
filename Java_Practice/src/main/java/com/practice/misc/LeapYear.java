package com.practice.misc;

public class LeapYear {

    public static void main(String[] args) {

        System.out.println(isLeapYear(1904));


    }

    public static boolean isLeapYear(int year){

        if(year % 4 == 0){

            // a century year may not be the leap year
            if(year % 100 == 0){

                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
