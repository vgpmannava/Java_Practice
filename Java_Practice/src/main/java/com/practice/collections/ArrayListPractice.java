package com.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
	
   public static void main(String[] args) {
	
	   List<String> names = new ArrayList<>();
       names.add("Sarath");
       names.add("Rahul");
       names.add("Avinash");
       names.add("Venu");
       
       System.out.println("Names: "+names.get(3));
    }

}
