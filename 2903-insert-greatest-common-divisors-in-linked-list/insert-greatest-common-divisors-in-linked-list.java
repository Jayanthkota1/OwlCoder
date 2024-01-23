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
   public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
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