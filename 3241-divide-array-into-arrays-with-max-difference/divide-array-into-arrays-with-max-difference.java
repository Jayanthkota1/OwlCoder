class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        //int n=(nums.length%3)+3;
        int m=(nums.length/3);
        int[][] a=new int[m][3];
        int l=0,b=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<3;j++){
                    if(l==nums.length) return a;
                    a[i][j]=nums[l++];
                    if(j>0 && a[i][j]-a[i][0]>k){
                        b=1;
                        break;
                    }
            }
            if(b==1) break;
        }
        int c[][]=new int[0][0]; 
        if(b==1) return c; 
        return a;
    }
}