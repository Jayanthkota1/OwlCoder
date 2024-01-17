class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }
        ArrayList<Integer> a=new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> e : map.entrySet())
        {
            if(a.contains(e.getValue())) return false;
            else a.add(e.getValue());
        }
        return true;
    }
}