class Solution {
    List<List<Integer>> a=new ArrayList<List<Integer>>();
    void sub(List<Integer>a1,int[] nums,int start){
       a.add(new ArrayList<>(a1));
       for(int i=start;i<nums.length;i++){           
        a1.add(nums[i]);
        sub(a1,nums,i+1);
        a1.remove(a1.size()-1);
       }
    }
    public List<List<Integer>> subsets(int[] nums) {
      List<Integer> a1=new ArrayList<Integer>();
      sub(a1,nums,0);
      return a;
    }
}