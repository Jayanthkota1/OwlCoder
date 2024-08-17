class Solution {
    public int alternatingSubarray(int[] nums) {
        int n=0,m=0,max=0,c=1,k=0;
        for(int i=0;i<nums.length-1;i++){
               if(nums[i]-nums[i+1]==-1)
               {
                    k=1;
                    if(m==1)
                    {
                        max=Math.max(max,c);
                        c=1;
                        n=0;
                        continue;
                    }
                    m=1;
                    if(n==1){
                        c+=1;
                        n=0;
                    }
               }
               else if(nums[i]-nums[i+1]==1)
               {
                if(m!=1)
                {
                    n=0;
                    max=Math.max(max,c);
                    continue;
                }
                if(n==1)
                    {
                        max=Math.max(max,c);
                        c=1;
                        continue;
                    }
                 n=1;
                 if(m==1)
                 {
                    c+=1;
                    m=0;
                 }
               }
               else
               {
                  max=Math.max(max,c);
                  c=1;
                  n=0;
                  m=0;
               }
             System.out.println(n+" "+m+" "+max+" "+c);
        }
        max=Math.max(max,c);
        if(k==0)
        {
            return -1;
        }

        return max+1;
    }
}