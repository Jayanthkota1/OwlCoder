class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n=arr.length;
        int feq[]=new int[k];
        for(int i=0;i<n;i++)
        {
            int rem=arr[i]%k;
            if(rem<0)
            { 
                rem=rem+k;
            }
            feq[rem]++;
        }
        if(feq[0]%2!=0) return false;
        for(int i=1;i<=k/2;i++) 
        {
            if(feq[i]!=feq[k-i]) return false;
        }
        return true;
        
    }
}