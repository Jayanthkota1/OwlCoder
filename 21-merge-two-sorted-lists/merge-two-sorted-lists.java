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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node1 = new ListNode(0);
        ListNode temp=node1;
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                ListNode get=new ListNode(list1.val);
                temp.next=get;
                temp=get;
                list1=list1.next;
            }
            else
            {
                ListNode get=new ListNode(list2.val);
                temp.next=get;
                temp=get;
                list2=list2.next;
            }
        }
        while(list1!=null)
        {
                ListNode get=new ListNode(list1.val);
                temp.next=get;
                temp=get;
                list1=list1.next;
        }
        while(list2!=null)
        {
                ListNode get=new ListNode(list2.val);
                temp.next=get;
                temp=get;
                list2=list2.next;
        }
        return node1.next;  
    }
}