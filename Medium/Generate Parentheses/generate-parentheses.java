//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    void fun(int op,int cl,int n,String s,ArrayList<String> a)
    {
        if(op==n && cl==n) 
        {
            a.add(s);
            return;
        }
        if(op<n) fun(op+1,cl,n,s+"(",a);
            
        if(op>cl) fun(op,cl+1,n,s+")",a);
        
    }
    public List<String> AllParenthesis(int n) 
    {
        ArrayList<String> a=new ArrayList<>();
        String s="";
        fun(0,0,n,s,a);
        return a;
    }
}