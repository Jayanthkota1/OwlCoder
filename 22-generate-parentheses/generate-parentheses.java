class Solution {
    void fun(int op,int cl,int n,String s,ArrayList<String> a)
    {
        if(op==n && cl==n)
        {
            a.add(s);
            return;
        }
        if(op<n) fun(op+1,cl,n,s+"(",a);
        if(op>cl) fun(op,cl+1,n,s+")",a);
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> a=new ArrayList<>();
        String s="";
        fun(0,0,n,s,a);
        return a;
    }
}