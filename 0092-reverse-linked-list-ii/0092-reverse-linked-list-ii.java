/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
       if (head == null || head.next == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(-1); // Dummy node to handle the case of left = 1
        dummy.next = head;
        ListNode prev = dummy;
        int count = 1; // Start count from 1

        // Move to the node just before the left position
        while (count < left) {
            prev = prev.next;
            count++;
        }

        // Initialize pointers for reversing the sublist
        ListNode cur = prev.next;
        ListNode fwd;

        // Reverse the sublist from left to right
        while (count < right) {
            fwd = cur.next;
            cur.next = fwd.next;
            fwd.next = prev.next;
            prev.next = fwd;
            count++;
        }

        return dummy.next;
    }
}