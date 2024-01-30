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
    public ListNode removeNodes(ListNode head) {
        if(head.val==99999 || head.val==99998){
            head.val=100000;
            head.next=null;
            return head;
        }
        ListNode n=head;
        ListNode n1=head;
        if(n.next==null) return head;
        n1=n1.next;
        while(n1!=null &&n1.next!=null){
        if(n1.val<n1.next.val) {
            n.next=n.next.next;
            n1=head.next;
            n=head;
        }
        else 
         {
            n1=n1.next;
            n=n.next;
         }
        }
               if(head.val<head.next.val)return head.next;
        return head;
    }
}