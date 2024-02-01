//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String S) {
        if(S.length()<26) return false;
        int a[]=new int[26];
        String s=S.toLowerCase();
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((int)ch>=97 && (int)ch<=122){
            //System.out.print(ch+" "+(int)ch+" ");
                 if(a[(int)ch-97]==0){
                      c+=1;
                      a[(int)ch-97]+=1;
                 }
            }
        }
        if(c==26) return true;
        return false;
    }
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends