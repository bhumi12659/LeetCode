class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int index = nums.length/2;
        int minmoves=0;
        for(int i=0;i<nums.length;i++){
            minmoves+=Math.abs(nums[i]-nums[index]);
        }
        return minmoves;
    }
}