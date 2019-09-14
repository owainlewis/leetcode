package com.owainlewis.leetcode.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class P344Test {
    @Test
    public void shouldReverseCharArray() {
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] expected = new char[]{'o','l','l','e','h'};

        P344.reverseString(input);

        assertArrayEquals(input, expected);
    }
}
