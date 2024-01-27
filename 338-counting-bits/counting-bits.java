class Solution {
    public int[] countBits(int n){
        int k=1;
        int a[]=new int[n+1];
        a[0]=0;
        while(k<=n)
        {
           k*=2;
           for(int i=k/2;i<k;i++) 
           {
           a[i]=a[i-k/2]+1;
           if(i==n) break;
           }
        }
        return a; 
    }
}