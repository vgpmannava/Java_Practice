package com.practice.codingbat.string3;

public class SameEnds {

    public static void main(String[] args) {
        
    }

    public String sameEnds(String string) {

        String longest = "";

        int middle = string.length()/2;
        int firstmid = middle;
        int lastmid = middle;

        if(string.length()>1 && string.length()%2 == 1){

            lastmid = middle +1;
        }

        for(int i=0; i<string.length(); i++){

            if(firstmid > 0 && lastmid < string.length()){

                if(string.substring(0, firstmid).equals(string.substring(lastmid))){

                    return string.substring(0, firstmid);
                }

            }

            firstmid--;
            lastmid++;
        }

        for(int i=0; i<string.length(); i++){

            if(firstmid > 0 && lastmid < string.length()){

                if(string.substring(0, i).equals(string.substring(string.length() - i, string.length()))){

                    longest = string.substring(0, i);
                }

            }

            firstmid--;
            lastmid++;
        }

        return "";
    }
}
