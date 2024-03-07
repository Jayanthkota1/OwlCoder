class Solution {
    public int[] sortedSquares(int[] nums) {
       int n= nums.length;
       int [] result= new int[n];
       int l=0,r=n-1;
       int resultIndex=n-1;
       while(l<=r){
           int leftSquare = nums[l]*nums[l];
           int rightSquare= nums[r]*nums[r];
           if(leftSquare>rightSquare){
               result[resultIndex]=leftSquare;
               l++;
           }else{
               result[resultIndex]=rightSquare;
               r--;
           }
           resultIndex--;
       }
       return result; 
    }
}