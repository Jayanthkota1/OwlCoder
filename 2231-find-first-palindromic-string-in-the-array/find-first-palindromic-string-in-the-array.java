class Solution {
    boolean ispal(String s){
        for(int i=0;i<(s.length()/2)+1;i++) if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++) if(ispal(words[i])) return words[i];
        return "";
    }
}