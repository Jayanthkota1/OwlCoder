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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode n=list1;
        ListNode n1=list1;
        while(n1!=null && b>0){
            if(a-->1) n=n.next;
            if(b-->0) n1=n1.next;
        }
        n.next=list2;
        while(list2.next!=null) list2=list2.next;
        list2.next=n1.next;
        return list1;
    }
}