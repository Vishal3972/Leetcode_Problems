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
    // Approach 1
    
//     public ListNode reverseList(ListNode head){
//         ListNode prev = null;
//         ListNode cur = head;
//         ListNode nextNode = head;
//         while(nextNode != null){
//             nextNode = nextNode.next;
//             cur.next = prev;
//             prev = cur;
//             cur = nextNode;
//         }
//         return prev;
//     }
    
//     public ListNode doubleIt(ListNode head) {
//         ListNode rev = reverseList(head);
//         int carry = 0;
//         ListNode cur = rev, prev = null;
        
//         while(cur != null){
//             int ans = cur.val*2 + carry;
//             cur.val = ans%10;
            
//             carry = ans/10;
            
//             prev = cur;
//             cur = cur.next;
//         }
        
//         if(carry > 0){
//             prev.next = new ListNode(carry);
//         }
        
//         return reverseList(rev);
//     }
    
    
    
    // Appraoach 2
    public ListNode doubleIt(ListNode head) {
        if(head.val > 4){
            head = new ListNode(0,head);
        }
        
        ListNode tmp = head;
        while(tmp != null){
            tmp.val = (tmp.val*2)%10;
            
            if(tmp.next != null && tmp.next.val > 4){
                tmp.val++;
            }
            tmp = tmp.next;
        }
        return head;
    }
}