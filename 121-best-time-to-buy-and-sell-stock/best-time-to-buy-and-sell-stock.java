class Solution {
    public int maxProfit(int[] arr) {
        int res=0;
        int buy=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<buy)
            {
                buy=arr[i];
            }
            else if(arr[i]-buy>res)
            {
                res=arr[i]-buy;
            }
        }
        return res;
    }
}