class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles,i=0,new1=99;
        while(new1>0){
           // if(numBottles==1) break;
            new1 = numBottles/numExchange;
            int rem = numBottles%numExchange;
            res+=new1;
            if( new1 >= numExchange){
                numBottles= new1+rem;
            } else{
                numBottles= new1 + rem;
            }
           // System.out.print(numBottles+" "+new1+" ");
           // i++;
        }
        return res;
    }
}