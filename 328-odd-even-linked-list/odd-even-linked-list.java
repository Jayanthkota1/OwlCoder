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
        ListNode n1=head;
        ListNode n2=new ListNode(0);
        ListNode n3=n2;
        while(n1!=null && n1.next!=null){
            n3.next=new ListNode(n1.next.val);
            n3=n3.next;
            if(n1.next.next==null) break;
            n1.next=n1.next.next;
            n1=n1.next;
        }
        n1.next=n2.next;
        return head;
    }
}