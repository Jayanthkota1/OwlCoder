class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
                       if(tokens[i].equals("+")) {
                           int a=Integer.valueOf(s.pop());
                           int b=Integer.valueOf(s.pop());
                           s.push(a+b);
                           //System.out.print(a+b+"\n");
                           }
                       else if(tokens[i].equals("-")) {
                           int a=Integer.valueOf(s.pop());
                           int b=Integer.valueOf(s.pop());
                           s.push(b-a);
                            //System.out.print(a-b+"\n");
                            }
                       else if(tokens[i].equals("/")) {
                           int a=Integer.valueOf(s.pop());
                           int b=Integer.valueOf(s.pop());
                           s.push(b/a);
                           // System.out.print(a/b+"\n");
                           }
                       else if(tokens[i].equals("*")) {
                           int a=Integer.valueOf(s.pop());
                           int b=Integer.valueOf(s.pop());
                           s.push(b*a);
                           // System.out.print(a*b+"\n");
                           }
                       else s.push(Integer.valueOf(tokens[i]));
        }
        return s.pop();
    }
}