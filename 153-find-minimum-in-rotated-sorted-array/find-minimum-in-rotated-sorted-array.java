class Solution {
    public int findMin(int[] nums) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
           a.add(nums[i]); 
           int ind=Collections.binarySearch(a,nums[i]);
                if(ind<0)
                {
                    ind=-(ind+1);
                    a.set(ind,nums[i]);
                }
        }
        return a.get(0);
    }
}