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
    public ListNode partition(ListNode head, int x) {
        ListNode head1=new ListNode(1);
        ListNode head2=new ListNode(1);
        ListNode temp1=head1;
        ListNode temp2=head2;
        
        while(head!=null){
            ListNode newNode=new ListNode(head.val);
            if(head.val<x){
                head1.next=newNode;
                head1=head1.next;
            }
            else{
                head2.next=newNode;
                head2=head2.next;
            }
            head=head.next;
        }
        head1.next=temp2.next;
        return temp1.next;
    }
}