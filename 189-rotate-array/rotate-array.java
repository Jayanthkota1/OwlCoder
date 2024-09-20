class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int j=0;
        int[] arr=new int[nums.length];
            for(int i=nums.length-k;i<nums.length;i++,j++)
            {
                arr[j]=nums[i];
            }
            for(int i=0;i<nums.length-k;i++,j++)
            {
                arr[j]=nums[i];
            }
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=arr[i];
            }
    }
}