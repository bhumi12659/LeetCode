class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        int first=0;
        int ans =0;
        while(first<=nums.length-2){
            int second = first+1;
            int diff = nums[second]-nums[first];
            ans = Math.max(ans,diff);
            first++;
        }
        return ans;
    }
}