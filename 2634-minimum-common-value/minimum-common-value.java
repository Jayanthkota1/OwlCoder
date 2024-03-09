class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0;
        //Arrays.sort(nums2);
        //HashMap<Integer,Integer> a = new HashMap<>();
        if (nums1[nums1.length-1] < nums2[0] || nums2[nums2.length-1] < nums1[0])
            return -1;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]) return nums1[i];
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        return -1;
    }
}