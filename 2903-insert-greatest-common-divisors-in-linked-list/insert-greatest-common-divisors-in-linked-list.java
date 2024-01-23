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
    private int gcd(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;
        ListNode n=head;
        ListNode n2=head;
        while(n.next!=null && n2.next!=null)
        {
            ListNode k=new ListNode(gcd(n.val,n.next.val));
            ListNode temp=n2.next;
            k.next=temp;
            n2.next=k;
            n=n.next.next;
            n2=n2.next.next;
        }                
        return head;
    }
}