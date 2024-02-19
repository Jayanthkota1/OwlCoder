class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum=0,k=0;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++) sum+=nums[i];
        for(int i=0;i<nums.length;i++){
            k+=nums[i];
            res[i]=sum+((nums[i]*i)-(k-nums[i]))-((nums.length-(i+1))*nums[i])-k;
        }
        return res;
    }
}