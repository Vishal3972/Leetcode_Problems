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
    // public ListNode deleteDuplicates(ListNode head) {
    //     if(head == null || head.next == null){
    //         return head;
    //     }
    //     ListNode n1 = head;
    //     ListNode n2 = head.next;
    //     while(n2 != null){
    //         if(n1.val == n2.val){
    //             n2 = n2.next;
    //         }else{
    //             n1.next = n2;
    //             n1 = n2;
    //             n2 = n2.next;
    //         }
    //     }
    //     n1.next = n2;
    //     return head;
    // }
    
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode n1 = head;
        while(n1 != null && n1.next!=null){
            if(n1.val == n1.next.val){
                n1.next = n1.next.next;
            }else{
                n1 = n1.next;
            }
        }
        return head;
    }
}