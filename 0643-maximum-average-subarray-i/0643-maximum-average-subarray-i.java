class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int si=0;
        int ei=k;
        int sum =0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum =sum;
        while(ei<nums.length){
            //window grow
            sum +=nums[ei];
            //window shrink
            sum -=nums[si];
            //ans update
            maxsum = Math.max(sum,maxsum);
            ei++;
            si++;
        }
        double avg = (double)maxsum/k;
        return avg;
    }
}