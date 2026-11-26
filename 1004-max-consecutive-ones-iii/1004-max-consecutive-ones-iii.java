class Solution {
    public int longestOnes(int[] nums, int k) {
        int si=0;
        int ei=0;
        int count=0;
        int len =0;
        while(ei<nums.length){
            if(nums[ei]==0){
                count++;
            }
            while(count>k && si<=ei){
                
                if(nums[si]==0){
                    count--;
                }
                si++;
            }
            len=Math.max(len,ei-si+1);
            ei++;
        }
        return len;
    }
}