package com.owainlewis.leetcode.problems;
/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * <strong>Example 1</strong>
 *
 * <pre>
 * Input: 1->1->2
 * Output: 1->2
 * </pre>
 *
 * <strong>Example 2</strong>
 *
 * <pre>
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 * </pre>
 */
public final class P83 {
    public static class ListNode {
        int val;

        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
