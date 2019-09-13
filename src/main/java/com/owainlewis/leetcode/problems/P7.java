package com.owainlewis.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 *
 * <pre>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * </pre>
 * <p>
 * Example 2:
 *
 * <pre>
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * </pre>
 * <p>
 * Example 3:
 * <pre>
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * </pre>
 */
public final class P7 {
    /**
     * Naive solution using brute force.
     *
     * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">Longest Substring Without Repeating Characters</a>
     */
    public int lengthOfLongestSubstringNaive(String s) {
        int n = s.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (isUniqueSubstring(s, i, j))
                    result = Math.max(result, j - i);
            }
        }

        return result;
    }

    private boolean isUniqueSubstring(String s, int start, int end) {
        Set<Character> chars = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character c = s.charAt(i);
            if (chars.contains(c)) return false;
            chars.add(c);
        }

        return true;
    }
}
