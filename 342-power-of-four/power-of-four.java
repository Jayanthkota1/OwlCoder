class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n%2!=0) return false;
        while(n>4)
        {
            if(n==4) return true;
            if(n%2!=0) return false;
            if((n/4)*4!=n) return false;
            n/=4;
        } 
        return n==4;
    }
}