class Solution {
    public int minSteps(String s, String t) {
        int a[]=new int[27];
        int b[]=new int[27];
        for(int i=0;i<s.length();i++)
        {
            a[(int)s.charAt(i)+1-97]++;
            b[(int)t.charAt(i)+1-97]++;
        }
        int k=0;
        for(int i=0;i<27;i++)
        {
          if(b[i]>a[i])
          {
              k+=(b[i]-a[i]);
          }  
        }
        return k;
    }
}