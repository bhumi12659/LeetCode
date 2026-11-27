class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int si=0;
        int ei=0;
        int len=0;
        while(ei<nums.length){
            if(nums[ei]==0){
                si=ei+1;
            }
            len=Math.max(len,ei-si+1);
            ei++;
        }
        return len;
    }
}