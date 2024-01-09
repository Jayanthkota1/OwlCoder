//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap<Integer, Integer> a=new HashMap<Integer, Integer>();
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(a.get(arr[i]) == null) 
            {
                     a.put(arr[i], 1);
            }
            else 
            {
                     a.put(arr[i], a.get(arr[i]) + 1);
            }
        }
        //Collections.sort(a1);
        //System.out.print(a);
        for(Map.Entry<Integer, Integer> entry: a.entrySet()) 
        {
          int target = entry.getValue();
          if(target > 1) 
          {
             a1.add(entry.getKey());
          }
        }
        Collections.sort(a1);
        if(a1.isEmpty())
        {
            a1.add(-1);
            return a1;
        }
        return a1;
    }
}
