//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution{
    int maxprofit(int remaining,int[] price,int[] dp){
        if(remaining==0) return 0;
        if(dp[remaining]!=-1) return dp[remaining];
        int max=Integer.MIN_VALUE ;
        for(int i = 0; i < remaining ; i++) max=Math.max(max,price[i]+maxprofit(remaining-i-1,price,dp));
        return dp[remaining]=max;
    }
    public int cutRod(int price[], int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp , -1);
        int max=Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++) max=Math.max(max,price[i]+maxprofit(n-i-1,price,dp));
        return max;
    }
}