class Solution {
    public String reversePrefix(String word, char ch) {
        int i=word.indexOf(ch);
        String s=word.substring(0,i+1);
        StringBuffer str=new StringBuffer(s);
        String s1=str.reverse().toString()+word.substring(i+1,word.length());
        return s1;
    }
}