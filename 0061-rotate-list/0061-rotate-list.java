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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        temp = head;
        k %= length; 
        
        if(k==0){
            return head;
        }
        
        int count = 1;
        while(temp != null && count < (length-k)){
            count++;
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null;
        temp = newHead;
        while(temp.next != null){
            temp = temp.next;
        }   
        temp.next = head;
        return newHead;
    }
}