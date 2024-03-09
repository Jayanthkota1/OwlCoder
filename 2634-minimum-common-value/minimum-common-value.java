class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        //Arrays.sort(nums2);
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(a.containsKey(nums1[i])) continue;
            else a.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
           if(a.containsKey(nums2[i])) return nums2[i];
        }
        return -1;
    }
}