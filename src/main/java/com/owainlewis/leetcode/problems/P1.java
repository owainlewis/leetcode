package com.owainlewis.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * <pre>
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * </pre>
 *
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 *
 */
public final class P1 {
    /**
     * O(N^2) solution
     *
     * @see <a href="https://leetcode.com/problems/two-sum/">Two sum</a>
     */
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[i];
                if (nums[j] == complement) {
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
    }

    /**
     * O(1) solution
     *
     * @see <a href="https://leetcode.com/problems/two-sum/">Two sum</a>
     */
    public int[] twoSumHash(int []nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
          int complement = target - nums[i];
          if (m.containsKey(complement)) {
              return new int[]{i, m.get(complement)};
          }
        }

        return new int[]{};
    }
}
