class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[]=new int[101];
        int max=0,c=0;
        for(int i=0;i<nums.length;i++){
            int k=++freq[nums[i]];
            if(max<k) max=k;
        }
       // System.out.print(max+"\n");
        for(int i=0;i<101;i++){
             if(freq[i]==max) c+=max;
             //System.out.print(freq[i]+" "+i+"\n");
        }
        return c;
    }
}