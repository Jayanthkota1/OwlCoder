class Solution {
    boolean ispal(String s){
         if(s== null || s.length() == 0){
            return false;
         }
        for(int i = 0; i < s.length()/2; i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++) if(ispal(words[i])) return words[i];
        return "";
    }
}