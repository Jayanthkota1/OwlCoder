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
    public ListNode removeElements(ListNode head, int val) {
        ListNode n=head;
        if(n==null) return null; 
        while(n.next!=null)
        {
            if(n.next.val==val)
            {
                n.next=n.next.next;
            }
            else
            {
                n=n.next;
            }
        }
        if(head.val == val) return head.next;
        return head;
    }
}