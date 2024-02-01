class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int m=nums.length;
        int[][] a=new int[m/3][3];
        int l=0,b=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<3;j++){
                    if(l==m) return a;
                    a[i][j]=nums[l++];
                    if(j>0 && a[i][j]-a[i][0]>k){
                        return new int[0][0];
                    }
            }
        }
 //       int c[][]=new int[0][0]; 
        return a;
    }
}