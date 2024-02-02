class Solution {
    int fun(int[] coins,int amount,int n,int[] dp){
        if(amount==0) return 0;
        if(dp[amount]!=-1) return dp[amount];
        int ans = 99999;
        for(int i=0;i<n;i++){
            if(coins[i]<=amount){
                ans = Math.min(ans,1+fun(coins,amount-coins[i],n,dp));
            }
        }
        return dp[amount]=ans;
    }
    public int coinChange(int[] coins, int amount) {
     int dp[]=new int[amount+1];
     Arrays.fill(dp,-1);
     int ans=fun(coins,amount,coins.length,dp);
     if(ans==99999) return -1;
     return ans;
    }
}