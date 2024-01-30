class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
                       String S=tokens[i];
                       if(S.equals("+")) s.push(s.pop()+s.pop());
                       else if(S.equals("-")) {
                           int a=s.pop();
                           int b=s.pop();
                           s.push(b-a);
                            }
                       else if(S.equals("/")) {
                           int a=s.pop();
                           int b=s.pop();
                           s.push(b/a);
                           }
                       else if(S.equals("*")) s.push(s.pop()*s.pop());
                       else s.push(Integer.valueOf(tokens[i]));
        }
        return s.pop();
    }
}