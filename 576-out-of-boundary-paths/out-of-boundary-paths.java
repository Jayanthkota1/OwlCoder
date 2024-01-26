class Solution {
    int mod=1000000007;
    private int find(int m,int n,int maxMove,int startRow,int startColumn,int[][][] dp)
    {
        if(startRow==-1 ||startColumn==-1 || startRow==m || startColumn==n) return 1;
        if(maxMove==0) return 0;
        if(dp[startRow][startColumn][maxMove]!=-1) return dp[startRow][startColumn][maxMove];
        int fh=(find(m,n,maxMove-1,startRow,startColumn+1,dp)+find(m,n,maxMove-1,startRow+1,startColumn,dp))%mod;
        int sh=(find(m,n,maxMove-1,startRow,startColumn-1,dp)+find(m,n,maxMove-1,startRow-1,startColumn,dp))%mod;
        return dp[startRow][startColumn][maxMove]=(fh+sh)%mod;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        // ArrayList<ArrayList<ArrayList<Integer>>> a=new ArrayList<;
        int[][][] dp=new int[m+1][n+1][maxMove+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return find(m,n,maxMove,startRow,startColumn,dp)%mod;
    }
}