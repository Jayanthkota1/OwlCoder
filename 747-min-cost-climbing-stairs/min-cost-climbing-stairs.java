class Solution {
    int vj(int[] cost,int [] jv,int n,int i){
        if(i==n) return 0;
        if(jv[i]!=-1){
            // System.out.print(i+" "+jv[i]+" ");         
             return jv[i];
        }
        int one=cost[i]+vj(cost,jv,n,i+1);
        int two=9999;
        if(i+2<=n) {
            two=cost[i]+vj(cost,jv,n,i+2);
        }
        //System.out.print(i+" "+Math.min(one,two)+" ");         
        return  jv[i]=Math.min(one,two);
    }
    public int minCostClimbingStairs(int[] cost) {
        int k=cost.length;
        int jv[]=new int[k];
        Arrays.fill(jv,-1);
        return Math.min(vj(cost,jv,k,0),vj(cost,jv,k,1));
    }
}