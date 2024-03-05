class Solution {
    public int minimumLength(String s) {
        int i=0,j=s.length()-1;
        if(s.length()==1) return 1;
        while(i<j){
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)==s.charAt(j)){
               // if(i+1==j) return 0;
                i++;
            }
            else if(s.charAt(j)==s.charAt(j-1) && s.charAt(i)==s.charAt(j)){
                j--;
            }
            else if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
                if(i==j) return 1;
            }
            else if(s.charAt(i)!=s.charAt(j)){
                return j-i+1;
            }
        }
        //if(i==j) return 1;
        return 0;
    }
}