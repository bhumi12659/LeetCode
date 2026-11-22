class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] idx=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    idx[i]=j;
                    break;
                }
            }
        }
        int[] ans = new int[nums1.length];
        for(int i=0;i<idx.length;i++){
           ans[i]= NGE(nums1,nums2,idx[i],i);
        }
        
        return ans;
    }
    public static int NGE(int[] nums1,int[] nums2,int idx,int ii){
        for(int i=idx+1;i<nums2.length;i++){
            if(nums2[i]>nums1[ii]){
                return nums2[i];
            }
        }
        return -1;
    }
}