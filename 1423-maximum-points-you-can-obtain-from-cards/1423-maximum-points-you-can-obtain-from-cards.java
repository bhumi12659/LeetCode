class Solution {
    public int maxScore(int[] nums, int k) {
        int maxSum =0;
        for(int i=0;i<nums.length;i++){
            maxSum+=nums[i];
        }
        System.out.println(maxSum);
        int si=0;
        int ei=0;
        int sum=0;
        int minsum=Integer.MAX_VALUE;
        while(ei<nums.length){
            sum+=nums[ei];
            while(ei-si>=nums.length-k){
                sum-=nums[si];
                si++;
            }
            if(ei-si==nums.length-k-1)
            minsum=Math.min(sum,minsum);
            ei++;
        }
        
        return maxSum-minsum;
    }
}