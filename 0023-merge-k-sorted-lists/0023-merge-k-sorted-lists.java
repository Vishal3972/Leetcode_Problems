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
    public static ListNode merge2list(ListNode n1,ListNode n2){
        if(n1==null){
            return n2;
        }
        if(n2==null){
            return n1;
        }
        ListNode head=new ListNode(0);
        ListNode tail=head;
        while(n1!=null && n2!=null){
            if(n1.val<=n2.val){
                tail.next=n1;
                n1=n1.next;
            }else{
                tail.next=n2;
                n2=n2.next;
            }
            tail=tail.next;
        }
        if(n1!=null){
            tail.next=n1;
        }else{
            tail.next=n2;
        }
        return head.next;
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode result = lists[0];
        for (int i = 1; i < lists.length; i++) {
            result = merge2list(lists[i], result);
        }
        return result;
    }
}