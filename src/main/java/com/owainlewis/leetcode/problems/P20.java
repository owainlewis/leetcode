package com.owainlewis.leetcode.problems;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
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

    private Map<Character, Character> mappings;

    public P20 () {
        this.mappings = Map.of(')', '(', ']', '[', '}', '{');
    }

    public boolean isOpeningParen(Character c) {
        return c == '(' || c == '[' || c == '{';
    }

    public Optional<Character> optionalPop(Stack<Character> s) {
        if (s.isEmpty()) return Optional.empty();
        return Optional.of(s.pop());
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (Character c : s.toCharArray()) {
            // If this is a closing paren ...
            if (this.mappings.containsKey(c)) {
                Optional<Character> topElement = stack.empty() ?
                        Optional.empty() :
                        Optional.of(stack.pop());
                if (!topElement.equals(Optional.of(this.mappings.get(c)))) {
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
