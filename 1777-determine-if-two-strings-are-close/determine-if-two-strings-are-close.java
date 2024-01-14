class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        else{
        int a[]=new int[27];
        int b[]=new int[27];
        for(int i=0;i<word1.length();i++){
                char ch=word1.charAt(i);
                a[ch-97]++;            
        }
        for(int i=0;i<word1.length();i++){
                char ch=word2.charAt(i);
                if(a[ch-97]!=0) b[ch-97]++;
                else return false;            
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<27;i++)
        {
            if(a[i]!=b[i])return false;
        }
        return true;
        }      
}
}