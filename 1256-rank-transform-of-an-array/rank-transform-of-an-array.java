class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int num[]=Arrays.copyOfRange(arr,0,arr.length);
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(num);
        int rank=1;
        for(int i=0;i<num.length;i++)
        {
            if(!map.containsKey(num[i]))
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