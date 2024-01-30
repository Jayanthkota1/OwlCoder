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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode n=head;
        ListNode temp=new ListNode(0);
        ListNode temp1=temp;
        while(n!=null && n.next!=null){
            ListNode n1=null;
            n1=new ListNode(n.next.val);
            n1.next=new ListNode(n.val);
            temp1.next=n1;
            temp1=temp1.next.next;
            n=n.next.next;
        }
        if(n!=null) temp1.next=n;
        return temp.next;
    }
}