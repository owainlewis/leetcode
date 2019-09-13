package com.owainlewis.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * <code>
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * </code>
 *
 */
public final class P1 {
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
    }

    public int[] twoSumHash(int []nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], i);
        }

        System.out.println(m);

        for(int i = 0; i < nums.length; i++) {
          int complement = target - nums[i];
          if (m.containsKey(complement)) {
              System.out.println(m.get(complement));
              return new int[]{i, m.get(complement)};
          }
        }

        return new int[]{};
    }
}
