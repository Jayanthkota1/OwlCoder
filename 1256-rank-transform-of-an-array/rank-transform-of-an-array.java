class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0)
        {
            return arr;
        }
        int num[]=Arrays.copyOfRange(arr,0,arr.length);
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(num);
        map.put(num[0],1);
        int rank=2;
        for(int i=1;i<num.length;i++)
        {
            if(num[i]!=num[i-1])
            {
                map.put(num[i],rank);
                rank+=1;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        return arr; 
    }
}