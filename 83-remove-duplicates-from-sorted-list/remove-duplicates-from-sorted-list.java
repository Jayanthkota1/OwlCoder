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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode n=head;
        if(n.next==null) return head;
        while(n!=null && n.next!=null)
        {
            int k =n.val;
            int k1=n.next.val;
            if(k==k1)
            {
                if(n.next.next==null) {
                    n.next=null ;
                    return head;
                }
                else n.next=n.next.next;
            }
            else n=n.next;
        }
        return head;
    }
}