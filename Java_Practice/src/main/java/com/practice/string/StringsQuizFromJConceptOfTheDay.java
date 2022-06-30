package com.practice.string;

public class StringsQuizFromJConceptOfTheDay {

    public static void main(String[] args) {

        System.out.println("1".concat("2").repeat(5).charAt(7));

        String str = "  Java\tConcept\tOf\tThe\tDay     ".strip();

        System.out.println(str);

        String str1 = new String("Java");

        String str2 = new String("Java");

        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));

        System.out.println("....str1.hashCode()..."+str1.hashCode()+"...str2.hashCode().."+str2.hashCode());

        System.out.println("JAVAJ2EE".substring(2, 5).substring(1).charAt(2));
    }
}
