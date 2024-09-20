class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        while(j<nums.length-1)
        {
            if(nums[j]==nums[j+1])
            {
                j+=1;
            }
            else
            {
                nums[i]=nums[j];
                i+=1;
                j+=1;
            }
        }
        nums[i]=nums[j];
        return i+1;
    }
}