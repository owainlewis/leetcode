package com.owainlewis.leetcode.common;

import java.util.HashMap;
import java.util.Map;

public final class ArrayIndexedHash {

    public static <T> Map<T, Integer> build(T[] values) {
        Map<T, Integer> m = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            m.put(values[i], i);
        }

        return m;
    }
}
