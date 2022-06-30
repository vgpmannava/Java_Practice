package com.practice.codingbat.string3;

public class GHappyString {
	
	public static void main(String[] args) {
		
		System.out.println(gHappy("gagg"));
	}

	public static boolean gHappy(String str) {
		  
		  boolean happy = true;
		  int len = str.length();
		  
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'g') {
					if (i > 0 && str.charAt(i - 1) == 'g')
						happy = true;
					else if (i < len - 1 && str.charAt(i + 1) == 'g')
						happy = true;
					else
						happy = false;
				}
			}
		  
		  return happy;
	}		  
		 
}
