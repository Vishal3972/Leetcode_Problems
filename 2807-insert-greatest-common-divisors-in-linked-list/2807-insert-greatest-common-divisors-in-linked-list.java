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
    public static int gcd(int m, int n){
        int g=1;
        for(int i=2;i<=Math.min(m,n);i++){
            if(m%i==0 && n%i==0){
                g=i;
            }
        }
        return g;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode tmp=head;
        while(tmp.next!=null){
            int g=gcd(tmp.val,tmp.next.val);
            ListNode n1=new ListNode(g);
            n1.next=tmp.next;
            tmp.next=n1;
            tmp=n1.next;
        }
        return head;
    }
}