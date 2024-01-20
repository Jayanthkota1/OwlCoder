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
    public boolean isPalindrome(ListNode head) {
         Stack<Integer> a=new Stack<Integer>();
         ListNode n1=head;
         ListNode n2=head;
         int k=0;
         while(n2!=null && n2.next!=null)
         {
             if(n2.next.next==null)
             {
                 a.push(n1.val);
                
                 k=1;
                 break;
             }
             a.push(n1.val);
             n1=n1.next;
             n2=n2.next.next;
         }
         n1=n1.next;
         while(n1!=null)
         {
            if(n1.val!=a.pop()) return false;
            n1=n1.next;
         }
         //System.out.print(a);
         return true;
    }
}