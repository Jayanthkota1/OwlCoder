//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        int freq[]=new int[26];
        int max=0;
        for(int i=0;i<s.length();i++){
            int k=++freq[s.charAt(i)-97];
            if(max<k) max=k;
        }
       //System.out.println(max);
        int c=0,c1=0,c2=0,c3=0;
        for(int i=0;i<26;i++){
           // System.out.println(freq[i]+" "+(i+97));
            if(freq[i]==0) continue;
            if(max==freq[i]) c1++;
            if(max-1==freq[i])c2++;
            if(freq[i]==1) c3++;
            c++;
            if(freq[i]==max || freq[i]==max-1) continue;
            if(c>2) return false;
        }
       // System.out.println(c+" "+c1);
        if(c==c1 || (c1==c-1 && c3==1) ||(c2==c-1 && c1==1)) return true;
        return false;
    }
}