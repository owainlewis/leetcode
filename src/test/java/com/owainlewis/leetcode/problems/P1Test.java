package com.owainlewis.leetcode.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class P1Test {
    @Test
    public void twoSumBruteForceShouldReturnCorrectResult() {
        int[] result = new P1().twoSumBruteForce(new int[]{2,7,11,15}, 9);
        assertArrayEquals(new int[]{0,1}, result);
    }
}
