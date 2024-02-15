class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long m=-1,k=2;
        long pref[]=new long[nums.length+1];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=nums[i]+pref[i-1];
            if(k>=3){
                if(nums[i]<pref[i-1]){
                   k+=1;
                  // System.out.print(k+" "+m+" "+pref[i]+"\n");
                   m=Math.max(m,pref[i]);
                }
            }
            else{
                k+=1;
            }
        }
        return m;
    }
}