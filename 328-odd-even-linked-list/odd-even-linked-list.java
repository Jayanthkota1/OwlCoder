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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return head;
        ListNode n=head;
        ListNode n1=new ListNode(0);
        ListNode n3=n1;
        while(n!=null && n.next!=null){
            n3.next=new ListNode(n.next.val);
            n3=n3.next;
            if(n.next.next==null) break;
            n.next=n.next.next;
            n=n.next;
        }
        n.next=n1.next;
        return head;
    }
}