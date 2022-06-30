package com.practice.codingbat.string3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMirrorEnds {

    MirrorEnds mirrorEnds = new MirrorEnds();

    @Test
    public void testMirrorEnds(){

        assertAll(() -> assertEquals("ab", mirrorEnds.mirrorEnds("abXYZba")),
                () -> assertEquals("a", mirrorEnds.mirrorEnds("abca")),
                () -> assertEquals("aba", mirrorEnds.mirrorEnds("aba")),
                () -> assertEquals("", mirrorEnds.mirrorEnds("abab")),
                () -> assertEquals("xxx", mirrorEnds.mirrorEnds("xxx")),
                () -> assertEquals("xxYxx", mirrorEnds.mirrorEnds("xxYxx")),
                () -> assertEquals("Hi ", mirrorEnds.mirrorEnds("Hi and iH")),
                () -> assertEquals("x", mirrorEnds.mirrorEnds("x")),
                () -> assertEquals("123", mirrorEnds.mirrorEnds("123and then 321")),
                () -> assertEquals("ba", mirrorEnds.mirrorEnds("band andab"))) ;
    }

}
