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
    public ListNode mergeNodes(ListNode head) {
        int sum=0;
        ListNode newHead = new ListNode(0);
        ListNode n1=newHead;
        while(head.next!=null){
            head=head.next;
            if(head.val != 0){
                sum+=head.val;
            }else{
                n1.next=new ListNode(sum);
                n1=n1.next;
                sum=0;
            }
        }
        return newHead.next;
    }
}