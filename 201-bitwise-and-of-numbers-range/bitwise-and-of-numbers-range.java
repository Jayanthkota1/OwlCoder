class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int c=0,c1=0;
        if(left==right)
        {
            return left;
        }
        for(int i=31;i>=0;i--)
        {
            if((left&(1<<i))!=0)
            {
                c=i;
                break;
            }
        }
        for(int j=31;j>=0;j--)
        {
            if((right&(1<<j))!=0)
            {
                c1=j;
                break;
            }
        }
        long res=0;
        if(c==c1)
        {
            res=left;
            for(long k=left+1;k<=right;k++)
            {
                res&=k;
            }
        }
        return (int)res;
    }
}