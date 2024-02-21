class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int c=0,c1=0;
        if(left==right)
        {
            return left;
        }
        c=(int)(Math.log(left)/Math.log(2))+1;
        c1=(int)(Math.log(right)/Math.log(2))+1;
        long res=0;
        if(c==c1)
        {
           res=left;
           if(right-left<(int)Math.pow(2,c-1)) {
                for(long i=left+1;i<=right;i++){
                    res&=i;
                }
           }
           else return 0;
        }
        return (int)res;
    }
}