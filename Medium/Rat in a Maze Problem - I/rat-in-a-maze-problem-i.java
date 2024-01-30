//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    static void fun(int[][] m,int n,int i,int j,ArrayList<String> res,int[][] Visited,String s)
    {
       if(i==n && j==n) return ;
       if(m[i][j]==0) return ;
       if(i==n-1 && j==n-1) {
           res.add(s);
           return ;
       }  
       if(i>0 && Visited[i-1][j]!=1){
           Visited[i-1][j]=1;
           fun(m,n,i-1,j,res,Visited,s+"U");
           Visited[i-1][j]=0;
       }
       if(i<n-1 && Visited[i+1][j]!=1){
           Visited[i+1][j]=1;
           fun(m,n,i+1,j,res,Visited,s+"D");
           Visited[i+1][j]=0;
       }
       if(j>0 && Visited[i][j-1]!=1){
           Visited[i][j-1]=1;
           fun(m,n,i,j-1,res,Visited,s+"L");
           Visited[i][j-1]=0;
       }
       if(j<n-1 && Visited[i][j+1]!=1){
           Visited[i][j+1]=1;
           fun(m,n,i,j+1,res,Visited,s+"R");
           Visited[i][j+1]=0;
       }
       return ;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        int Visited[][]=new int[n+1][n+1];
        //for(int i=0;i<n;i++) Arrays.fill(Visited[i],0);
        //System.out.print(Visited[0][1]);
        ArrayList<String> res=new ArrayList<String>();
        String s="";
        Visited[0][0]=1;
        fun(m,n,0,0,res,Visited,s);
        //if(k==0) res.add("-1");
        return res;
    }
}