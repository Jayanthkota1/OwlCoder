class Solution {
    public int[] twoSum(int[] n, int t) {
        int d=0,e=0;
        int a[]=new int[2],c=0;
        int b[]=new int[n.length];
        for(int i=0;i<n.length;i++)
        {
            b[i]=n[i];
        }
        Arrays.sort(n);
        int i=0,j=n.length-1;
        while(i<j)
        {
            if(n[i]+n[j]==t)
            {
                d=n[i];
                e=n[j];
                break;
            }
            else if(n[i]+n[j]<t)
            {
                i+=1;
            }
            else
            {
                j-=1;
            }
        }
        for(i=0;i<n.length;i++)
        {
            if(b[i]==d)
            {
                a[0]=i;
                break;
            }
        }
        for(j=n.length-1;j>=0;j--)
        {
            if(b[j]==e)
            {
                a[1]=j;
                break;
            }
        }
        return a;
    }
}