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
        if(head==null || head.next==null){
            return head;
        }
 
        ListNode head1=new ListNode(1);
        ListNode head2=new ListNode(1);
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode cur=head;
        
        while(cur!=null){
            ListNode newNode=new ListNode(cur.val);
            if(cur.val<x){
                head1.next=newNode;
                head1=head1.next;
            }
            else{
                head2.next=newNode;
                head2=head2.next;
            }
            cur=cur.next;
        }
        temp1=temp1.next;
        temp2=temp2.next;
        if(temp1==null){
            return temp2;
        }
        if(temp2==null){
            return temp1;
        }
        head1.next=temp2;
        return temp1;
    }
}