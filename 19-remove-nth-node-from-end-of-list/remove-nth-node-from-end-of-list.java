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
    public ListNode removeNthFromEnd(ListNode head, int k) {
        ListNode n1=head;
        ListNode n2=head;
        while(k-->0)
        {
            n2=n2.next;
        }
        if(n2==null){
            return head.next;
        }
        while(n2.next!=null)
        {
            n1=n1.next;
            n2=n2.next;
        }
        n1.next=n1.next.next;
        return  head;
    }
}