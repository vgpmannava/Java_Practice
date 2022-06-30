package com.practice.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPassByValue {

		   
	public static void main(String[] args) 
	   {
			/*
			 * Integer i = new Integer(10); Integer j = new Integer(20); swap(i, j);
			 * System.out.println("i = " + i + ", j = " + j);
			 */

	      List testList =  new ArrayList<>(Arrays.asList("1","2","3","4"));

	      changeList(testList);
	      System.out.println(Arrays.toString(testList.toArray()));

	   }
	
	public static void changeList(List list) {

		list.add("5");
	}
	
	// swap() doesn't swap i and j
   public static void swap(Integer i, Integer j) 
   {
      Integer temp = i;
      i = j;
      j = temp;
   }
		   
}


