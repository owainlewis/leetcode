package com.owainlewis.leetcode.problems;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
 * input string is valid.
 *
 * <p>An input string is valid if:
 *
 * <p>Open brackets must be closed by the same type of brackets. Open brackets must be closed in the
 * correct order. Note that an empty string is also considered valid.
 *
 * <p>Example 1:
 *
 * <p>Input: "()" Output: true Example 2:
 *
 * <p>Input: "()[]{}" Output: true Example 3:
 *
 * <p>Input: "(]" Output: false Example 4:
 *
 * <p>Input: "([)]" Output: false Example 5:
 *
 * <p>Input: "{[]}" Output: true
 */
public final class P20 {

    private HashMap<Character, Character> mappings;

    public P20 () {
        this.mappings = new HashMap<>();
        this.mappings.put(')', '(');
        this.mappings.put(']', '[');
        this.mappings.put('}', '{');
    }

    public boolean isOpeningParen(Character c) {
        return c == '(' || c == '[' || c == '{';
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (Character c : s.toCharArray()) {
            // If this is a closing paren ...
            if (this.mappings.containsKey(c)) {
                char topElement = stack.empty() ? '@' : stack.pop();
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                if (this.isOpeningParen(c)) {
                    stack.push(c);
                }
            }
        }

        return stack.isEmpty();
    }
}
