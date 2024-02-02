class Solution {
    long fun(int[] coins,int amount,int n,long[] dp){
        if(amount==0) return 0;
        if(dp[amount]!=-1) return dp[amount];
        long ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(coins[i]<=amount){
                ans = Math.min(ans,1+fun(coins,amount-coins[i],n,dp));
            }
        }
        return dp[amount]=ans;
    }
    public int coinChange(int[] coins, int amount) {
     long dp[]=new long[amount+1];
     Arrays.fill(dp,-1);
     long ans=fun(coins,amount,coins.length,dp);
     if(ans==Integer.MAX_VALUE) return -1;
     return (int)ans;
    }
}