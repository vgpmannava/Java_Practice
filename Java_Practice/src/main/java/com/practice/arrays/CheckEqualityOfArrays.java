package com.practice.arrays;

import java.util.Arrays;

public class CheckEqualityOfArrays {

    public static void main(String[] args) {

        int[] intArray1 = new int[]{1,3,4,8,15,25};
        int[] intArray2 = new int[]{1,3,4,8,15,25, 36};

        String[] s1 = {"java", "j2ee", "struts", "hibernate"};

        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};

        System.out.println("Int Arrays Are Equal..."+arraysAreEqual(intArray1, intArray2));

        System.out.println("String Arrays Are Equal..."+stringArraysAreEqual(s1, s2));

        // 2nd Method using Arrays class

        // System.out.println(Arrays.equals(intArray1, intArray2));
    }

    public static boolean arraysAreEqual(int[] intArray1, int[] intArray2) {

        int arrayLen = 0;
        if (intArray1.length == intArray2.length) {

            arrayLen = intArray1.length;
        } else {

            return false;
        }
        for (int i = 0; i < arrayLen; i++) {

            if (intArray1[i] != intArray2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean stringArraysAreEqual(String[] str1, String[] str2) {

        int arrayLen = 0;
        if (str1.length == str2.length) {

            arrayLen = str1.length;
        } else {

            return false;
        }
        for (int i = 0; i < arrayLen; i++) {

            if (!str1[i].equals(str2[i])) {
                return false;
            }
        }

        return true;
    }

}
