/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode n1=head;
        ListNode n2=head.next;
        while(n2!=null && n2.next!=null){
            if(n1==n2){
                return true;
            }
            n1=n1.next;
            n2=n2.next.next;
        }
        return false;
    }
}