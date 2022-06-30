package com.practice.codingbat.string3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGHappyString {

	   GHappyString happyString = new GHappyString();

	   @Test
	   public void testHappy() {	  
		   
		   assertAll(() -> assertEquals(true, happyString.gHappy("ggagg")),
				   () -> assertEquals(false, happyString.gHappy("gag")),
				   () -> assertEquals(false, happyString.gHappy("gagg")),
				   () -> assertEquals(false, happyString.gHappy("ggag")));
	   }
	   
}
