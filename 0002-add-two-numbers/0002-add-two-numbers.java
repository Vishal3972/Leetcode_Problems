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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        int carry = 0;
        while(l1 != null || l2 != null){
            int x = 0, y = 0;
            if(l1 != null){
                x = l1.val;
            }
            if(l2 != null){
                y = l2.val;
            }
            int sum = x+y+carry;
            carry = sum/10;

            current.next = new ListNode(sum%10);
            current = current.next;

            if(l1 != null){
                l1 = l1.next;
            }  
            if(l2 != null){
                l2 = l2.next;
            }            
        }
        if(carry > 0){
            current.next = new ListNode(carry);
        }

        return temp.next;   
    }
}