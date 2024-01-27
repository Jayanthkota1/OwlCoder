class Solution {
    public int[] countBits(int n){
        int k=1,j=0;
        int a[]=new int[n+1];
        a[0]=0;
        while(k<=n)
        {
           k*=2;
           for(int i=k/2;i<k;i++) 
           {
           a[i]=a[i-k/2]+1;
           j+=a[i];
           if(i==n) break;
           }
        }
      //  System.out.print(j);
        return a; 
    }
}