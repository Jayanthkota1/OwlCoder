//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class insertion
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			insertion llist = new insertion(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        Solution ob = new Solution();
		head = ob.insertionSort(llist.head);
		llist.printList(head);
		
        t--;		
        }
    }}
// } Driver Code Ends


//User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution
{
    public static Node insertionSort(Node h)
    {
        Node n=null;
        while(h!=null)
        {   
            if(n==null) n=new Node(h.data);
            else{
                Node temp=new Node(h.data);
                if(n.next==null){
                    if(n.data>temp.data){
                        temp.next=n;
                        n=temp;
                    }
                    else n.next=temp;
                }
                else{
                    if(n.data>temp.data){
                        temp.next=n;
                        n=temp;
                    }
                    else{
                        Node temp1=n;
                        while(temp1.next!=null && temp1.next.data<temp.data) temp1=temp1.next;
                        Node temp2=temp1.next;
                        temp1.next=temp;
                        temp1.next.next=temp2;
                    }
                }
            }
            h=h.next;
        }
        return n;
    }
}