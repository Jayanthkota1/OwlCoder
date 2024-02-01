class Solution {
     int fun(int i,int j,int m,int n,int[][] dp,int[][] ob){
        //System.out.print(i+" "+j+"\n");
        if(i==m || j==n) return 0;
        if(ob[i][j]==1) return 0;
        if(i==m-1 && j==n-1){
          return 1;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=fun(i+1,j,m,n,dp,ob)+fun(i,j+1,m,n,dp,ob);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
        return fun(0,0,m,n,dp,obstacleGrid);
    }
}