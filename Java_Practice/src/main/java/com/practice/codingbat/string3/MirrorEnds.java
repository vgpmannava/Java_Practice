package com.practice.codingbat.string3;

//Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words,
//zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping).
//For example, the string "abXYZba" has the mirror end "ab".
//
//        mirrorEnds("abXYZba") → "ab"
//        mirrorEnds("abca") → "a"
//        mirrorEnds("aba") → "aba"
public class MirrorEnds {

    public static void main(String[] args) {

        // Test class TestMirrorEnds also available
        System.out.println(mirrorEnds("abXYZba"));

    }

    public static String mirrorEnds(String string) {

        String mirrorStr = "";

        for(int i=0; i<string.length(); i++){

            if(string.charAt(i) == string.charAt(string.length() - i - 1)){

                mirrorStr = mirrorStr + string.charAt(i);

            } else {
                break;
            }
        }

        return mirrorStr;
    }

}
