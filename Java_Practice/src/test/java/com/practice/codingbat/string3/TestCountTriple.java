package com.practice.codingbat.string3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCountTriple {

    CountTriple triple = new CountTriple();

    @Test
    public void testHappy() {

        Assertions.assertEquals(1, CountTriple.countTriple("abcXXXabc"));
        Assertions.assertEquals(3, CountTriple.countTriple("xxxabyyyycd"));
        Assertions.assertEquals(0, CountTriple.countTriple("a"));
        Assertions.assertEquals(0, CountTriple.countTriple(""));

        /*assertAll(() -> assertEquals(1, triple.countTriple("abcXXXabc")),
                () -> assertEquals(3, triple.countTriple("xxxabyyyycd")),
                () -> assertEquals(0, triple.countTriple("a")),
                () -> assertEquals(0, triple.countTriple("")),
                () -> assertEquals(1, triple.countTriple("XXXabc")),
                () -> assertEquals(2, triple.countTriple("XXXXabc")),
                () -> assertEquals(3, triple.countTriple("XXXXXabc")),
                () -> assertEquals(3, triple.countTriple("222abyyycdXXX")),
                () -> assertEquals(4, triple.countTriple("abYYYabXXXXXab")),
                () -> assertEquals(0, triple.countTriple("abYYXabXXYXXab")),
                () -> assertEquals(0, triple.countTriple("abYYXabXXYXXab")),
                () -> assertEquals(1, triple.countTriple("122abhhh2")));*/
    }
}
