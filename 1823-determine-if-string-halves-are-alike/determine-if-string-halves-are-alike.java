class Solution {
    public boolean isovel(char ch)
    {
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
    }
    public boolean halvesAreAlike(String S) {
        int c=0,c1=0;
        for(int i=0,j=S.length()/2;i<S.length()/2;i++,j++)
        {
            char ch=S.charAt(i);
            if(isovel(ch))
            {
                c+=1;
            }
            char ch1=S.charAt(j);
            if(isovel(ch1))
            {
                c1+=1;
            }
        }
        System.out.print(c+" "+c1);
        return(c==c1);
    }
}