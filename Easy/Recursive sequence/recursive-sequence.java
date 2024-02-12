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
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long mod=1000000007;
    static long sequence(int n){
        long res=0;
        int i=1,l=1;
       while(i<=n){
           long k=1;
           for(int j=0;j<i;j++){
             //  System.out.print(l+" ");
               k=(k*l++)%mod;
           }
          // System.out.print(k+" \n");
           i+=1;
           res=(res+k)%mod;
       }
       return res%mod;
    }
}