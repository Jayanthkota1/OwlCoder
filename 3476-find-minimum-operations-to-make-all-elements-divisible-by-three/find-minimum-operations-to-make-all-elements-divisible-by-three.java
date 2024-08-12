class Solution {
    public int minimumOperations(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
             int k=nums[i]%3;
             if(k==1 || k==2) res+=1;
        }
        return res;
    }
}