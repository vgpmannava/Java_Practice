package com.practice.codingbat.string3;

public class CountTriple {

    public static int countTriple(String str) {

        int count = 0;
        String twoStr = "";

        if(str.length() >=3) {

            twoStr = str.substring(0, 2);

            for(int i=1; i<str.length(); i++){

                if((i+2) <= str.length()){

                    if(str.substring(i, i+2).equals(twoStr)){
                        count++;
                    }

                    twoStr = str.substring(i, i+2);
                }
            }
        }

        return count;
    }
}
