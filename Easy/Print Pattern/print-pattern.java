//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine().trim());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.pattern(N);
            for(int i = 0;i < ans.size();i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    void fun(ArrayList<Integer> a,int N,int k)
    {
        if(N<=0) {
            a.add(N);
            return;
        }
        a.add(N);
        fun(a,N-5,k);
        a.add(N);
        return ;
    }
    public List<Integer> pattern(int N){
        ArrayList<Integer> a=new ArrayList<>();
        fun(a,N,N);
        return a;
    }
}