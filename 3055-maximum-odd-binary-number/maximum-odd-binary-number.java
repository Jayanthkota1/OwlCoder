class Solution {
    public String maximumOddBinaryNumber(String s) {
        //StringBuffer s1=new StringBuffer();
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
           if(s.charAt(i)=='1'){
                c+=1;
           }  
        }
        String s1="";
        for(int i=0;i<s.length()-1;i++){
            if(c>1){
                s1+="1";
                c--;
            }
            else s1+="0";
        }
        s1+="1";
        return s1;
    }
}