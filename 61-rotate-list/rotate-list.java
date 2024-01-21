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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        if(head.next==null) return head;
         ListNode n3=head;
         int c=1;
         while(n3.next!=null)
         {
             c+=1;
             n3=n3.next;
         }
         if(c==k) return head;
         if(c<k) k=k%c;
        ListNode n1=head;
        while(k-->0)
        {
            ListNode n2=head;
            while(n2.next!=null)
            {
                n2=n2.next;
                if(n1.next.next==null) continue;
                n1=n1.next;
            }
            n1.next=n1.next.next;
            n2.next=head;
            head=n2;
            n1=n2;
        } 
        System.gc();
        return n1;
    }
}