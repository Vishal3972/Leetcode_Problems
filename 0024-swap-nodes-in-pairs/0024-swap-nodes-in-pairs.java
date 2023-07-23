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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = head.next;
        ListNode prev = null;
        ListNode current = head;
        ListNode fwd = null;
        while(current != null && current.next != null){
           if(prev == null){
               fwd = current.next;
               current.next = fwd.next;
               fwd.next = current;
               prev = current;
               current = prev.next;
           }else{
               fwd = current.next;
               current.next = fwd.next;
               fwd.next = current;
               prev.next = fwd;
               prev = current;
               current = prev.next;
           }
        }
        return newHead;
    }
}