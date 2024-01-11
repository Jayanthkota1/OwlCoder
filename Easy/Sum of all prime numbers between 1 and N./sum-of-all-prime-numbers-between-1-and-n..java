//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.prime_Sum(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public long prime_Sum(int n)
    {
        boolean a[] = new boolean[n+1];
        Arrays.fill(a,true);
        a[0]=a[1]=false;
        long k=0;
        for(int i=2;i*i<=n;i++)
        {
            if(a[i])
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    a[j]=false;
                }
            }
        }
        for(int l=2;l<=n;l++)
        {
            if(a[l])
            {
                k+=l;
            }
        }
        return k;
    }
}