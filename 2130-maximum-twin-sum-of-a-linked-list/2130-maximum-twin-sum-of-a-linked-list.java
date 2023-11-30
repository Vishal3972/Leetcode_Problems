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
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int sum=0,i=0,j=list.size()-1;
        while(i<j){
            sum=Math.max(sum,list.get(i)+list.get(j));
            i++;
            j--;
        }
        return sum;
    }
}