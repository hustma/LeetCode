public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0) return nums1;
        if(nums2.length == 0) return nums2;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.length;i++){
            for(int j = 0;j < nums2.length;j++){
                if(nums2[j] == nums1[i]){
                    set.add(nums1[i]);
                }
            }
        }
        
        if(set.size() == 0) return new int[0];
        int[] res = new int[set.size()];
        int i = 0;
        for(Integer temp : set){
            res[i++] = temp;
        }
        return res;
    }
}