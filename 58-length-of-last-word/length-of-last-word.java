class Solution {
    public int lengthOfLastWord(String s) {
        int k=0,c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && k==1){
                break;
            }
            else if(s.charAt(i)==' ') continue;
            else{
                k=1;
                c++;
            }
        }
        return c;
    }
}