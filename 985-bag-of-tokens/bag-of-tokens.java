class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
          Arrays.sort(tokens);
          int i=0,j=tokens.length-1,c=0,max=0;
          while(i<=j){
              if(power>=tokens[i]){
                  //System.out.print(c+" "+i+" "+j+" "+power+"hello\n");
                  power=power-tokens[i];
                  c++;
                  if(max<c) max=c;
                  i++;
              }
              else if(c>0){
                 // System.out.print(c+" "+i+" "+j+" "+power+"hi\n");
                  power+=tokens[j];
                  c--;
                  j--;
              }
              else return c;
          }
          return max;
    }
}