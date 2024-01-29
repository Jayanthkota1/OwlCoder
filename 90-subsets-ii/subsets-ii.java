class Solution {
    void fun(ArrayList<List<Integer>> a,ArrayList<Integer>a1,int start,int[] nums){
        if(a.contains(a1)) return;
        a.add(new ArrayList<Integer>(a1));
        for(int i=start;i<nums.length;i++)
        {
              a1.add(nums[i]);
              fun(a,a1,i+1,nums);
              a1.remove(a1.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> a=new ArrayList<>();
        Arrays.sort(nums);
        fun(a,new ArrayList<Integer>(),0,nums);
        return a;
    }
}