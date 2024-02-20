class Solution {
    public boolean isHappy(int n) {
        int r=0,j=0;
        while(j==0)
        {
            r=0;
            int k=n;    
                while(k>0)
                {
                    int d=k%10;
                    r=r+d*d;
                    k/=10;
                }
               // System.out.println(r);
                if(r<10 && r==1)
                {
                    return true;
                }
                else if(r<10 && r!=7) return false;
                n=r;
        }
        return false;
    }
}