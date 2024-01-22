class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> a=new HashMap<Integer, Integer>();
        int a1[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(a.containsKey(nums[i])) a.put(nums[i],a.get(nums[i])+1);
            else a.put(nums[i],1);
        }
        for(int i=1;i<=nums.length;i++)
        {
             if(a.containsKey(i)) 
             { //System.out.print(a.get(i)+" ");
                 if(a.get(i)==2) 
                 {
                     a1[0]=i;   
                 }
            }
             else 
             {
                 a1[1]=i;
             } 
        }
            return a1;
    }
}