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
        int c=0;
        ListNode n=head;
        while(n!=null)
        {
            c+=1;
            n=n.next;
        }
        c=c-k;
        int i=1;
        ListNode n2=new ListNode(0);
        ListNode n1=n2;
        while(head!=null)
        {
           if(i==c+1)
           {
               head=head.next;
               i+=1;
               continue;
           }
           i+=1;
           //System.out.print(head.val+" ");
           ListNode check=new ListNode(head.val);
           head=head.next;
           n1.next=check;
           n1=check;
        }
        return  n2.next;
    }
}