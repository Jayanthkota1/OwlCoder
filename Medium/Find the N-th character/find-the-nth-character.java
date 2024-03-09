//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String S = sc.next();
                    int R = sc.nextInt();
                    int N = sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.nthCharacter(S,R,N));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        while(r-->0){
            String s1="";
            for(int i=0;i<s.length() && s1.length()<n+2;i++) {
               if(s.charAt(i)=='1') s1+="10";
               else s1+="01";
            }
            s=s1;
           // System.out.println(s);
        }
        return s.charAt(n);  
    }
}