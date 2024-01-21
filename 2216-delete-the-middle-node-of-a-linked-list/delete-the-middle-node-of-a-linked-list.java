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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        if(head.next.next==null)
        {
            head.next=head.next.next;
             return head;
        }
        ListNode n=head;
        ListNode n1=head;
        n1=n1.next.next;
        while(n1!=null && n1.next!=null)
        {
            n=n.next;
            n1=n1.next.next;
        }
        n.next=n.next.next;
        return head;
    }
}