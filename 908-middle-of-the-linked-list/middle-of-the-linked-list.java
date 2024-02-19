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
    public ListNode middleNode(ListNode head) {
         ListNode n2=head;
         if(head.next==null) return head;
         if(head.next.next==null) return head.next;
         while(n2!=null && n2.next!=null)
         {
             head=head.next;
             n2=n2.next.next;
         }
         return head;
    }
}