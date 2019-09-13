package com.owainlewis.leetcode.problems;

import com.owainlewis.leetcode.supporting.TreeNode;

/**
 * Invert a binary tree.
 *
 * Example:
 *
 * <strong>Input:</strong>
 * <pre>
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * </pre>
 *
 * <strong>Output:</strong>
 * <pre>
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *</pre>
 */
public final class P226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);

        root.left = right;
        root.right = left;

        return root;
    }
}
