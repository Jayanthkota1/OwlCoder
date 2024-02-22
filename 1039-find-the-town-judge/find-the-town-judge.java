class Solution {
    public int findJudge(int n, int[][] trust) {
        int in[]=new int[n+2];
        int out[]=new int[n+2];
        for(int i=0;i<trust.length;i++){
            //System.out.print(trust[i][0]+" "+trust[i][1]+" ");
            in[trust[i][1]]++;
            out[trust[i][0]]++;
        }
        for(int i=1;i<n+1;i++){
            if(in[i]==n-1 && out[i]==0) return i;
        }
        return -1;
    }
}