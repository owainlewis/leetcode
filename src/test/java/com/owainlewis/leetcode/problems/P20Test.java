package com.owainlewis.leetcode.problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class P20Test {
    private static final P20 p20 = new P20();

    @ParameterizedTest
    @ValueSource(strings = {"()", "(())", "[]"})
    void isValidShouldReturnTrueForValidInputs(String input) {
        assertTrue(p20.isValid(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"(", "(()", "[]]"})
    void isValidShouldReturnFalseForBadInputs(String input) {
        assertFalse(p20.isValid(input));
    }
}


