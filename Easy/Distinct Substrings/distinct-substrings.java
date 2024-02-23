//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.fun(s);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int fun(String s) 
    {
        HashMap<String,Integer> s1 = new HashMap<String,Integer>();
        int c=0;
        for(int i=0;i<s.length()-1;i++){
            String k="";
            k+=""+s.charAt(i)+""+s.charAt(i+1)+"";
            if(s1.containsKey(k)) continue;
            s1.put(k,1);
            c+=1;
        }
        return c;
    }
} 