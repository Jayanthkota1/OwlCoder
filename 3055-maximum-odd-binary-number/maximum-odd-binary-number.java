import java.util.Arrays;

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1=0;
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='1'){
                count1++;
            }
        }
        char a[]=new char[s.length()];
        a[s.length()-1]='1';
        for(int i=0;i<s.length()-1;i++){
            if(count1>1){
                a[i]='1';
                count1--;
            }else{
                a[i]='0';
            }
        }
        return new String(a);
    }
}