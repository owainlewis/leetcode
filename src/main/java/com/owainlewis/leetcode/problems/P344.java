package com.owainlewis.leetcode.problems;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 */
public final class P344 {

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char tmp = s[i];
            // This is the index of the item in the second half of the char array to flip
            int idx = (s.length - 1) - i;
            s[i] = s[idx];
            s[idx] = tmp;
        }
    }
}
