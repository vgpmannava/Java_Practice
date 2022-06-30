package com.practice.codingbat.string3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMaxBlock {

    MaxBlock maxBlock = new MaxBlock();

    @Test
    public void testMaxBlock(){

        assertAll(() -> assertEquals(2, maxBlock.maxBlock("hoopla")),
                () -> assertEquals(3, maxBlock.maxBlock("abbCCCddBBBxx")),
                () -> assertEquals(0, maxBlock.maxBlock("")),
                () -> assertEquals(1, maxBlock.maxBlock("xyz")),
                () -> assertEquals(2, maxBlock.maxBlock("xxyz")),
                () -> assertEquals(2, maxBlock.maxBlock("xyzz")),
                () -> assertEquals(3, maxBlock.maxBlock("abbbcbbbxbbbx")),
                () -> assertEquals(6, maxBlock.maxBlock("XXBBBbbxxxxaaaaaa")),
                () -> assertEquals(4, maxBlock.maxBlock("XXBBBBbbxx")),
                () -> assertEquals(4, maxBlock.maxBlock("XXBBBbbxxXXXX")),
                () -> assertEquals(4, maxBlock.maxBlock("XX2222BBBbbXX2222"))
                );
    }


}
